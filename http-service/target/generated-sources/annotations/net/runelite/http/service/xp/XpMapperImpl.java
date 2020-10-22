package net.runelite.http.service.xp;

import javax.annotation.Generated;
import net.runelite.http.api.hiscore.HiscoreResult;
import net.runelite.http.api.hiscore.Skill;
import net.runelite.http.api.xp.XpData;
import net.runelite.http.service.xp.beans.XpEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-22T10:21:23-0500",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.7 (Eclipse OpenJ9)"
)
public class XpMapperImpl implements XpMapper {

    @Override
    public XpData xpEntityToXpData(XpEntity xpEntity) {
        if ( xpEntity == null ) {
            return null;
        }

        XpData xpData = new XpData();

        xpData.setTime( xpEntity.getTime() );
        xpData.setAttack_xp( xpEntity.getAttack_xp() );
        xpData.setDefence_xp( xpEntity.getDefence_xp() );
        xpData.setStrength_xp( xpEntity.getStrength_xp() );
        xpData.setHitpoints_xp( xpEntity.getHitpoints_xp() );
        xpData.setRanged_xp( xpEntity.getRanged_xp() );
        xpData.setPrayer_xp( xpEntity.getPrayer_xp() );
        xpData.setMagic_xp( xpEntity.getMagic_xp() );
        xpData.setCooking_xp( xpEntity.getCooking_xp() );
        xpData.setWoodcutting_xp( xpEntity.getWoodcutting_xp() );
        xpData.setFletching_xp( xpEntity.getFletching_xp() );
        xpData.setFishing_xp( xpEntity.getFishing_xp() );
        xpData.setFiremaking_xp( xpEntity.getFiremaking_xp() );
        xpData.setCrafting_xp( xpEntity.getCrafting_xp() );
        xpData.setSmithing_xp( xpEntity.getSmithing_xp() );
        xpData.setMining_xp( xpEntity.getMining_xp() );
        xpData.setHerblore_xp( xpEntity.getHerblore_xp() );
        xpData.setAgility_xp( xpEntity.getAgility_xp() );
        xpData.setThieving_xp( xpEntity.getThieving_xp() );
        xpData.setSlayer_xp( xpEntity.getSlayer_xp() );
        xpData.setFarming_xp( xpEntity.getFarming_xp() );
        xpData.setRunecraft_xp( xpEntity.getRunecraft_xp() );
        xpData.setHunter_xp( xpEntity.getHunter_xp() );
        xpData.setConstruction_xp( xpEntity.getConstruction_xp() );
        xpData.setOverall_rank( xpEntity.getOverall_rank() );
        xpData.setAttack_rank( xpEntity.getAttack_rank() );
        xpData.setDefence_rank( xpEntity.getDefence_rank() );
        xpData.setStrength_rank( xpEntity.getStrength_rank() );
        xpData.setHitpoints_rank( xpEntity.getHitpoints_rank() );
        xpData.setRanged_rank( xpEntity.getRanged_rank() );
        xpData.setPrayer_rank( xpEntity.getPrayer_rank() );
        xpData.setMagic_rank( xpEntity.getMagic_rank() );
        xpData.setCooking_rank( xpEntity.getCooking_rank() );
        xpData.setWoodcutting_rank( xpEntity.getWoodcutting_rank() );
        xpData.setFletching_rank( xpEntity.getFletching_rank() );
        xpData.setFishing_rank( xpEntity.getFishing_rank() );
        xpData.setFiremaking_rank( xpEntity.getFiremaking_rank() );
        xpData.setCrafting_rank( xpEntity.getCrafting_rank() );
        xpData.setSmithing_rank( xpEntity.getSmithing_rank() );
        xpData.setMining_rank( xpEntity.getMining_rank() );
        xpData.setHerblore_rank( xpEntity.getHerblore_rank() );
        xpData.setAgility_rank( xpEntity.getAgility_rank() );
        xpData.setThieving_rank( xpEntity.getThieving_rank() );
        xpData.setSlayer_rank( xpEntity.getSlayer_rank() );
        xpData.setFarming_rank( xpEntity.getFarming_rank() );
        xpData.setRunecraft_rank( xpEntity.getRunecraft_rank() );
        xpData.setHunter_rank( xpEntity.getHunter_rank() );
        xpData.setConstruction_rank( xpEntity.getConstruction_rank() );

        return xpData;
    }

    @Override
    public XpData hiscoreResultToXpData(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return null;
        }

        XpData xpData = new XpData();

        int rank = hiscoreResultAgilityRank( hiscoreResult );
        xpData.setAgility_rank( rank );
        int rank1 = hiscoreResultStrengthRank( hiscoreResult );
        xpData.setStrength_rank( rank1 );
        int rank2 = hiscoreResultFletchingRank( hiscoreResult );
        xpData.setFletching_rank( rank2 );
        long experience = hiscoreResultMiningExperience( hiscoreResult );
        xpData.setMining_xp( (int) experience );
        int rank3 = hiscoreResultAttackRank( hiscoreResult );
        xpData.setAttack_rank( rank3 );
        long experience1 = hiscoreResultAgilityExperience( hiscoreResult );
        xpData.setAgility_xp( (int) experience1 );
        long experience2 = hiscoreResultRunecraftExperience( hiscoreResult );
        xpData.setRunecraft_xp( (int) experience2 );
        int rank4 = hiscoreResultThievingRank( hiscoreResult );
        xpData.setThieving_rank( rank4 );
        int rank5 = hiscoreResultHitpointsRank( hiscoreResult );
        xpData.setHitpoints_rank( rank5 );
        long experience3 = hiscoreResultCraftingExperience( hiscoreResult );
        xpData.setCrafting_xp( (int) experience3 );
        int rank6 = hiscoreResultFishingRank( hiscoreResult );
        xpData.setFishing_rank( rank6 );
        int rank7 = hiscoreResultHerbloreRank( hiscoreResult );
        xpData.setHerblore_rank( rank7 );
        long experience4 = hiscoreResultMagicExperience( hiscoreResult );
        xpData.setMagic_xp( (int) experience4 );
        int rank8 = hiscoreResultRunecraftRank( hiscoreResult );
        xpData.setRunecraft_rank( rank8 );
        long experience5 = hiscoreResultStrengthExperience( hiscoreResult );
        xpData.setStrength_xp( (int) experience5 );
        long experience6 = hiscoreResultSlayerExperience( hiscoreResult );
        xpData.setSlayer_xp( (int) experience6 );
        long experience7 = hiscoreResultFishingExperience( hiscoreResult );
        xpData.setFishing_xp( (int) experience7 );
        long experience8 = hiscoreResultHitpointsExperience( hiscoreResult );
        xpData.setHitpoints_xp( (int) experience8 );
        int rank9 = hiscoreResultSmithingRank( hiscoreResult );
        xpData.setSmithing_rank( rank9 );
        long experience9 = hiscoreResultThievingExperience( hiscoreResult );
        xpData.setThieving_xp( (int) experience9 );
        int rank10 = hiscoreResultRangedRank( hiscoreResult );
        xpData.setRanged_rank( rank10 );
        long experience10 = hiscoreResultSmithingExperience( hiscoreResult );
        xpData.setSmithing_xp( (int) experience10 );
        long experience11 = hiscoreResultConstructionExperience( hiscoreResult );
        xpData.setConstruction_xp( (int) experience11 );
        int rank11 = hiscoreResultCraftingRank( hiscoreResult );
        xpData.setCrafting_rank( rank11 );
        long experience12 = hiscoreResultAttackExperience( hiscoreResult );
        xpData.setAttack_xp( (int) experience12 );
        int rank12 = hiscoreResultHunterRank( hiscoreResult );
        xpData.setHunter_rank( rank12 );
        int rank13 = hiscoreResultWoodcuttingRank( hiscoreResult );
        xpData.setWoodcutting_rank( rank13 );
        long experience13 = hiscoreResultFarmingExperience( hiscoreResult );
        xpData.setFarming_xp( (int) experience13 );
        long experience14 = hiscoreResultFletchingExperience( hiscoreResult );
        xpData.setFletching_xp( (int) experience14 );
        long experience15 = hiscoreResultRangedExperience( hiscoreResult );
        xpData.setRanged_xp( (int) experience15 );
        int rank14 = hiscoreResultOverallRank( hiscoreResult );
        xpData.setOverall_rank( rank14 );
        int rank15 = hiscoreResultConstructionRank( hiscoreResult );
        xpData.setConstruction_rank( rank15 );
        long experience16 = hiscoreResultHunterExperience( hiscoreResult );
        xpData.setHunter_xp( (int) experience16 );
        int rank16 = hiscoreResultDefenceRank( hiscoreResult );
        xpData.setDefence_rank( rank16 );
        long experience17 = hiscoreResultDefenceExperience( hiscoreResult );
        xpData.setDefence_xp( (int) experience17 );
        int rank17 = hiscoreResultFiremakingRank( hiscoreResult );
        xpData.setFiremaking_rank( rank17 );
        int rank18 = hiscoreResultMiningRank( hiscoreResult );
        xpData.setMining_rank( rank18 );
        long experience18 = hiscoreResultHerbloreExperience( hiscoreResult );
        xpData.setHerblore_xp( (int) experience18 );
        int rank19 = hiscoreResultFarmingRank( hiscoreResult );
        xpData.setFarming_rank( rank19 );
        long experience19 = hiscoreResultPrayerExperience( hiscoreResult );
        xpData.setPrayer_xp( (int) experience19 );
        int rank20 = hiscoreResultMagicRank( hiscoreResult );
        xpData.setMagic_rank( rank20 );
        long experience20 = hiscoreResultCookingExperience( hiscoreResult );
        xpData.setCooking_xp( (int) experience20 );
        int rank21 = hiscoreResultPrayerRank( hiscoreResult );
        xpData.setPrayer_rank( rank21 );
        long experience21 = hiscoreResultFiremakingExperience( hiscoreResult );
        xpData.setFiremaking_xp( (int) experience21 );
        long experience22 = hiscoreResultWoodcuttingExperience( hiscoreResult );
        xpData.setWoodcutting_xp( (int) experience22 );
        int rank22 = hiscoreResultSlayerRank( hiscoreResult );
        xpData.setSlayer_rank( rank22 );
        int rank23 = hiscoreResultCookingRank( hiscoreResult );
        xpData.setCooking_rank( rank23 );

        return xpData;
    }

    private int hiscoreResultAgilityRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill agility = hiscoreResult.getAgility();
        if ( agility == null ) {
            return 0;
        }
        int rank = agility.getRank();
        return rank;
    }

    private int hiscoreResultStrengthRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill strength = hiscoreResult.getStrength();
        if ( strength == null ) {
            return 0;
        }
        int rank = strength.getRank();
        return rank;
    }

    private int hiscoreResultFletchingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill fletching = hiscoreResult.getFletching();
        if ( fletching == null ) {
            return 0;
        }
        int rank = fletching.getRank();
        return rank;
    }

    private long hiscoreResultMiningExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill mining = hiscoreResult.getMining();
        if ( mining == null ) {
            return 0L;
        }
        long experience = mining.getExperience();
        return experience;
    }

    private int hiscoreResultAttackRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill attack = hiscoreResult.getAttack();
        if ( attack == null ) {
            return 0;
        }
        int rank = attack.getRank();
        return rank;
    }

    private long hiscoreResultAgilityExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill agility = hiscoreResult.getAgility();
        if ( agility == null ) {
            return 0L;
        }
        long experience = agility.getExperience();
        return experience;
    }

    private long hiscoreResultRunecraftExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill runecraft = hiscoreResult.getRunecraft();
        if ( runecraft == null ) {
            return 0L;
        }
        long experience = runecraft.getExperience();
        return experience;
    }

    private int hiscoreResultThievingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill thieving = hiscoreResult.getThieving();
        if ( thieving == null ) {
            return 0;
        }
        int rank = thieving.getRank();
        return rank;
    }

    private int hiscoreResultHitpointsRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill hitpoints = hiscoreResult.getHitpoints();
        if ( hitpoints == null ) {
            return 0;
        }
        int rank = hitpoints.getRank();
        return rank;
    }

    private long hiscoreResultCraftingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill crafting = hiscoreResult.getCrafting();
        if ( crafting == null ) {
            return 0L;
        }
        long experience = crafting.getExperience();
        return experience;
    }

    private int hiscoreResultFishingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill fishing = hiscoreResult.getFishing();
        if ( fishing == null ) {
            return 0;
        }
        int rank = fishing.getRank();
        return rank;
    }

    private int hiscoreResultHerbloreRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill herblore = hiscoreResult.getHerblore();
        if ( herblore == null ) {
            return 0;
        }
        int rank = herblore.getRank();
        return rank;
    }

    private long hiscoreResultMagicExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill magic = hiscoreResult.getMagic();
        if ( magic == null ) {
            return 0L;
        }
        long experience = magic.getExperience();
        return experience;
    }

    private int hiscoreResultRunecraftRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill runecraft = hiscoreResult.getRunecraft();
        if ( runecraft == null ) {
            return 0;
        }
        int rank = runecraft.getRank();
        return rank;
    }

    private long hiscoreResultStrengthExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill strength = hiscoreResult.getStrength();
        if ( strength == null ) {
            return 0L;
        }
        long experience = strength.getExperience();
        return experience;
    }

    private long hiscoreResultSlayerExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill slayer = hiscoreResult.getSlayer();
        if ( slayer == null ) {
            return 0L;
        }
        long experience = slayer.getExperience();
        return experience;
    }

    private long hiscoreResultFishingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill fishing = hiscoreResult.getFishing();
        if ( fishing == null ) {
            return 0L;
        }
        long experience = fishing.getExperience();
        return experience;
    }

    private long hiscoreResultHitpointsExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill hitpoints = hiscoreResult.getHitpoints();
        if ( hitpoints == null ) {
            return 0L;
        }
        long experience = hitpoints.getExperience();
        return experience;
    }

    private int hiscoreResultSmithingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill smithing = hiscoreResult.getSmithing();
        if ( smithing == null ) {
            return 0;
        }
        int rank = smithing.getRank();
        return rank;
    }

    private long hiscoreResultThievingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill thieving = hiscoreResult.getThieving();
        if ( thieving == null ) {
            return 0L;
        }
        long experience = thieving.getExperience();
        return experience;
    }

    private int hiscoreResultRangedRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill ranged = hiscoreResult.getRanged();
        if ( ranged == null ) {
            return 0;
        }
        int rank = ranged.getRank();
        return rank;
    }

    private long hiscoreResultSmithingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill smithing = hiscoreResult.getSmithing();
        if ( smithing == null ) {
            return 0L;
        }
        long experience = smithing.getExperience();
        return experience;
    }

    private long hiscoreResultConstructionExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill construction = hiscoreResult.getConstruction();
        if ( construction == null ) {
            return 0L;
        }
        long experience = construction.getExperience();
        return experience;
    }

    private int hiscoreResultCraftingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill crafting = hiscoreResult.getCrafting();
        if ( crafting == null ) {
            return 0;
        }
        int rank = crafting.getRank();
        return rank;
    }

    private long hiscoreResultAttackExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill attack = hiscoreResult.getAttack();
        if ( attack == null ) {
            return 0L;
        }
        long experience = attack.getExperience();
        return experience;
    }

    private int hiscoreResultHunterRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill hunter = hiscoreResult.getHunter();
        if ( hunter == null ) {
            return 0;
        }
        int rank = hunter.getRank();
        return rank;
    }

    private int hiscoreResultWoodcuttingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill woodcutting = hiscoreResult.getWoodcutting();
        if ( woodcutting == null ) {
            return 0;
        }
        int rank = woodcutting.getRank();
        return rank;
    }

    private long hiscoreResultFarmingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill farming = hiscoreResult.getFarming();
        if ( farming == null ) {
            return 0L;
        }
        long experience = farming.getExperience();
        return experience;
    }

    private long hiscoreResultFletchingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill fletching = hiscoreResult.getFletching();
        if ( fletching == null ) {
            return 0L;
        }
        long experience = fletching.getExperience();
        return experience;
    }

    private long hiscoreResultRangedExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill ranged = hiscoreResult.getRanged();
        if ( ranged == null ) {
            return 0L;
        }
        long experience = ranged.getExperience();
        return experience;
    }

    private int hiscoreResultOverallRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill overall = hiscoreResult.getOverall();
        if ( overall == null ) {
            return 0;
        }
        int rank = overall.getRank();
        return rank;
    }

    private int hiscoreResultConstructionRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill construction = hiscoreResult.getConstruction();
        if ( construction == null ) {
            return 0;
        }
        int rank = construction.getRank();
        return rank;
    }

    private long hiscoreResultHunterExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill hunter = hiscoreResult.getHunter();
        if ( hunter == null ) {
            return 0L;
        }
        long experience = hunter.getExperience();
        return experience;
    }

    private int hiscoreResultDefenceRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill defence = hiscoreResult.getDefence();
        if ( defence == null ) {
            return 0;
        }
        int rank = defence.getRank();
        return rank;
    }

    private long hiscoreResultDefenceExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill defence = hiscoreResult.getDefence();
        if ( defence == null ) {
            return 0L;
        }
        long experience = defence.getExperience();
        return experience;
    }

    private int hiscoreResultFiremakingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill firemaking = hiscoreResult.getFiremaking();
        if ( firemaking == null ) {
            return 0;
        }
        int rank = firemaking.getRank();
        return rank;
    }

    private int hiscoreResultMiningRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill mining = hiscoreResult.getMining();
        if ( mining == null ) {
            return 0;
        }
        int rank = mining.getRank();
        return rank;
    }

    private long hiscoreResultHerbloreExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill herblore = hiscoreResult.getHerblore();
        if ( herblore == null ) {
            return 0L;
        }
        long experience = herblore.getExperience();
        return experience;
    }

    private int hiscoreResultFarmingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill farming = hiscoreResult.getFarming();
        if ( farming == null ) {
            return 0;
        }
        int rank = farming.getRank();
        return rank;
    }

    private long hiscoreResultPrayerExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill prayer = hiscoreResult.getPrayer();
        if ( prayer == null ) {
            return 0L;
        }
        long experience = prayer.getExperience();
        return experience;
    }

    private int hiscoreResultMagicRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill magic = hiscoreResult.getMagic();
        if ( magic == null ) {
            return 0;
        }
        int rank = magic.getRank();
        return rank;
    }

    private long hiscoreResultCookingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill cooking = hiscoreResult.getCooking();
        if ( cooking == null ) {
            return 0L;
        }
        long experience = cooking.getExperience();
        return experience;
    }

    private int hiscoreResultPrayerRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill prayer = hiscoreResult.getPrayer();
        if ( prayer == null ) {
            return 0;
        }
        int rank = prayer.getRank();
        return rank;
    }

    private long hiscoreResultFiremakingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill firemaking = hiscoreResult.getFiremaking();
        if ( firemaking == null ) {
            return 0L;
        }
        long experience = firemaking.getExperience();
        return experience;
    }

    private long hiscoreResultWoodcuttingExperience(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0L;
        }
        Skill woodcutting = hiscoreResult.getWoodcutting();
        if ( woodcutting == null ) {
            return 0L;
        }
        long experience = woodcutting.getExperience();
        return experience;
    }

    private int hiscoreResultSlayerRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill slayer = hiscoreResult.getSlayer();
        if ( slayer == null ) {
            return 0;
        }
        int rank = slayer.getRank();
        return rank;
    }

    private int hiscoreResultCookingRank(HiscoreResult hiscoreResult) {
        if ( hiscoreResult == null ) {
            return 0;
        }
        Skill cooking = hiscoreResult.getCooking();
        if ( cooking == null ) {
            return 0;
        }
        int rank = cooking.getRank();
        return rank;
    }
}
