package net.runelite.client.plugins.inferno;

import java.time.Instant;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.Notifier;

import javax.inject.Inject;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
class InfernoTimer
{
    // the total number of seconds that the timer should run for
    @Getter @Setter
    private long duration;

    // the number of seconds remaining on the timer, as of last updated time
    private long remaining;

    // whether this timer is in the 'warning' state or not
    @Getter(AccessLevel.NONE)
    private transient boolean warning;

    // whether this timer should loop or not
    private boolean loop;
    // last updated time (recorded as seconds since epoch)
    protected long lastUpdate;

    // whether the clock is currently running
    protected boolean active;
    @Inject
    private Notifier notifier;

    InfernoTimer()
    {
        super();
        this.duration = 0;//45,210
        this.remaining = duration;
        this.warning = true;
        this.lastUpdate = Instant.now().getEpochSecond();
        this.active = false;
    }

    boolean addTime(long extraDuration) {
        if (active && duration > 0)
        {
            if (remaining > 0)
            {
                log.debug("add time: " + extraDuration);
                log.debug("duration: " + duration);
                log.debug("remaining: " + remaining);
                remaining = extraDuration + Math.max(0, remaining - (Instant.now().getEpochSecond() - lastUpdate));
                warning = false;
            }
            lastUpdate = Instant.now().getEpochSecond();
            return true;
        }

        return false;
    }

    long getDisplayTime()
    {
        if (!active)
        {
            return remaining;
        }

        return Math.max(0, remaining - (Instant.now().getEpochSecond() - lastUpdate));
    }

    boolean start()
    {
        if (!active && duration > 0)
        {
            if (remaining <= 0)
            {
                remaining = duration;
                warning = false;
            }
            lastUpdate = Instant.now().getEpochSecond();
            active = true;
            return true;
        }

        return false;
    }

    boolean pause()
    {
        if (active)
        {
            active = false;
            remaining = Math.max(0, remaining - (Instant.now().getEpochSecond() - lastUpdate));
            lastUpdate = Instant.now().getEpochSecond();
            return true;
        }

        return false;
    }

    void reset()
    {
        active = false;
        remaining = duration;
        lastUpdate = Instant.now().getEpochSecond();
    }

    boolean isWarning()
    {
        return warning && (remaining > 0);
    }

}