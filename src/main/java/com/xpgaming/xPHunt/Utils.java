package com.xpgaming.xphunt;

import com.pixelmonmod.pixelmon.enums.EnumNature;
import com.pixelmonmod.pixelmon.enums.EnumPokemon;
import com.xpgaming.xphunt.enums.EnumEvolutionPokemon;
import com.xpgaming.xphunt.enums.EnumItems;
import com.xpgaming.xphunt.enums.EnumRarePokemon;
import com.xpgaming.xphunt.enums.EnumVeryRarePokemon;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.scheduler.Task;
import org.spongepowered.api.text.Text;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Utils {
    private static Utils instance = new Utils();
    public static Utils getInstance() {
        return instance;
    }
    private static final SecureRandom random = new SecureRandom();
    public void randomisePokemon(int slot) {
        switch(slot) {
            case 1:
                cancelTimers(1);
                Main.pokemon1 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
                while(EnumEvolutionPokemon.doesntSpawnNaturally(Main.pokemon1)) Main.pokemon1 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
                Main.nature1 = randomEnum(EnumNature.class).toString();
                Main.nature1b = randomEnum(EnumNature.class).toString();
                while(Main.nature1b.equalsIgnoreCase(Main.nature1)) Main.nature1b = randomEnum(EnumNature.class).toString();
                Main.nature1c = randomEnum(EnumNature.class).toString();
                while(Main.nature1c.equalsIgnoreCase(Main.nature1b) || Main.nature1c.equalsIgnoreCase(Main.nature1)) Main.nature1c = randomEnum(EnumNature.class).toString();
                if(EnumRarePokemon.rarePokemon(Main.pokemon1)) Main.pokemon1rc = randomRareCandy(1);
                else Main.pokemon1rc = randomRareCandy(0);
                if(EnumRarePokemon.rarePokemon(Main.pokemon1)) {
                    Main.pokemon1ballReward = randomBall(1, 1);
                    Main.pokemon1moneyReward = randomMoney(1);
                } else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon1)) {
                    Main.pokemon1rc = randomRareCandy(2);
                    Main.pokemon1ballReward = randomBall(1, 2);
                    Main.pokemon1moneyReward = randomMoney(2);
                } else {
                    Main.pokemon1ballReward = randomBall(1, 0);
                    Main.pokemon1moneyReward = randomMoney(0);
                }
                startTimer(1);
                break;
            case 2:
                cancelTimers(2);
                Main.pokemon2 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
                while(EnumEvolutionPokemon.doesntSpawnNaturally(Main.pokemon2)) Main.pokemon2 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
                Main.nature2 = randomEnum(EnumNature.class).toString();
                Main.nature2b = randomEnum(EnumNature.class).toString();
                while(Main.nature2b.equalsIgnoreCase(Main.nature2)) Main.nature2b = randomEnum(EnumNature.class).toString();
                Main.nature2c = randomEnum(EnumNature.class).toString();
                while(Main.nature2c.equalsIgnoreCase(Main.nature2b) || Main.nature2c.equalsIgnoreCase(Main.nature2)) Main.nature2c = randomEnum(EnumNature.class).toString();
                if(EnumRarePokemon.rarePokemon(Main.pokemon2)) Main.pokemon2rc = randomRareCandy(1);
                else Main.pokemon2rc = randomRareCandy(0);
                if(EnumRarePokemon.rarePokemon(Main.pokemon2)) {
                    Main.pokemon2ballReward = randomBall(2, 1);
                    Main.pokemon2moneyReward = randomMoney(1);
                } else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon2)) {
                    Main.pokemon2rc = randomRareCandy(2);
                    Main.pokemon2ballReward = randomBall(2, 2);
                    Main.pokemon2moneyReward = randomMoney(2);
                } else {
                    Main.pokemon2ballReward = randomBall(2, 0);
                    Main.pokemon2moneyReward = randomMoney(0);
                }
                startTimer(2);
                break;
            case 3:
                cancelTimers(3);
                Main.pokemon3 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
                while(EnumEvolutionPokemon.doesntSpawnNaturally(Main.pokemon3)) Main.pokemon3 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
                Main.nature3 = randomEnum(EnumNature.class).toString();
                Main.nature3b = randomEnum(EnumNature.class).toString();
                while(Main.nature3b.equalsIgnoreCase(Main.nature3)) Main.nature3b = randomEnum(EnumNature.class).toString();
                Main.nature3c = randomEnum(EnumNature.class).toString();
                while(Main.nature3c.equalsIgnoreCase(Main.nature3b) || Main.nature3c.equalsIgnoreCase(Main.nature3)) Main.nature3c = randomEnum(EnumNature.class).toString();
                if(EnumRarePokemon.rarePokemon(Main.pokemon3)) Main.pokemon3rc = randomRareCandy(1);
                else Main.pokemon3rc = randomRareCandy(0);
                if(EnumRarePokemon.rarePokemon(Main.pokemon3)) {
                    Main.pokemon3ballReward = randomBall(3, 1);
                    Main.pokemon3moneyReward = randomMoney(1);
                } else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon3)) {
                    Main.pokemon3rc = randomRareCandy(2);
                    Main.pokemon3ballReward = randomBall(3, 2);
                    Main.pokemon3moneyReward = randomMoney(2);
                } else {
                    Main.pokemon3ballReward = randomBall(3, 0);
                    Main.pokemon3moneyReward = randomMoney(0);
                }
                startTimer(3);
                break;
            case 4:
                cancelTimers(4);
                Main.pokemon4 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
                while(EnumEvolutionPokemon.doesntSpawnNaturally(Main.pokemon4)) Main.pokemon4 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
                Main.nature4 = randomEnum(EnumNature.class).toString();
                Main.nature4b = randomEnum(EnumNature.class).toString();
                while(Main.nature4b.equalsIgnoreCase(Main.nature4)) Main.nature4b = randomEnum(EnumNature.class).toString();
                Main.nature4c = randomEnum(EnumNature.class).toString();
                while(Main.nature4c.equalsIgnoreCase(Main.nature4b) || Main.nature4c.equalsIgnoreCase(Main.nature4)) Main.nature4c = randomEnum(EnumNature.class).toString();
                if(EnumRarePokemon.rarePokemon(Main.pokemon4)) Main.pokemon4rc = randomRareCandy(1);
                else Main.pokemon4rc = randomRareCandy(0);
                if(EnumRarePokemon.rarePokemon(Main.pokemon4)) {
                    Main.pokemon4ballReward = randomBall(4, 1);
                    Main.pokemon4moneyReward = randomMoney(1);
                }
                else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon4)) {
                    Main.pokemon4rc = randomRareCandy(2);
                    Main.pokemon4ballReward = randomBall(4, 2);
                    Main.pokemon4moneyReward = randomMoney(2);
                }
                else {
                    Main.pokemon4ballReward = randomBall(4, 0);
                    Main.pokemon4moneyReward = randomMoney(0);
                }
                startTimer(4);
                break;
        }

    }

    public static <T extends Enum<?>> T randomEnum(Class<T> enumClass){
        int x = random.nextInt(enumClass.getEnumConstants().length);
        return enumClass.getEnumConstants()[x];
    }

    public String sanitisePokemon(String poke) {
        if(poke.equalsIgnoreCase("MrMime")) return "Mr. Mime";
        else if(poke.equalsIgnoreCase("MimeJr")) return "Mime Jr.";
        else if(poke.equalsIgnoreCase("Porygon-Z")) return "Shinx";
        else if(poke.equalsIgnoreCase("Nidoranfemale")) return "Nidoran\u2640";
        else if(poke.equalsIgnoreCase("Nidoranmale")) return "Nidoran\u2642";
        else if(poke.equalsIgnoreCase("Farfetchd")) return "Farfetch'd";
        return poke;
    }

    public String calculateTimeDifference(LocalDateTime from, LocalDateTime to) {

        LocalDateTime fromTemp = LocalDateTime.from(from);
        long years = fromTemp.until(to, ChronoUnit.YEARS);
        fromTemp = fromTemp.plusYears(years);

        long months = fromTemp.until(to, ChronoUnit.MONTHS);
        fromTemp = fromTemp.plusMonths(months);

        long days = fromTemp.until(to, ChronoUnit.DAYS);
        fromTemp = fromTemp.plusDays(days);

        long hours = fromTemp.until(to, ChronoUnit.HOURS);
        fromTemp = fromTemp.plusHours(hours);

        long minutes = fromTemp.until(to, ChronoUnit.MINUTES);
        fromTemp = fromTemp.plusMinutes(minutes);

        long seconds = fromTemp.until(to, ChronoUnit.SECONDS);
        fromTemp = fromTemp.plusSeconds(seconds);

        long millis = fromTemp.until(to, ChronoUnit.MILLIS);

        return "\u00A7f"+days+"\u00A7bD \u00A7f"+hours+"\u00A7bH \u00A7f" + minutes + "\u00A7bM \u00A7f" + seconds + "\u00A7bS\u00A77";

    }

    public int isInHunt(String name) {
        String pokemonName = sanitisePokemon(name);
        if(Main.pokemon1.equalsIgnoreCase(pokemonName)) {
            return 1;
        }
        else if(Main.pokemon2.equalsIgnoreCase(pokemonName)) {
            return 2;
        }
        else if(Main.pokemon3.equalsIgnoreCase(pokemonName)) {
            return 3;
        }
        else if(Main.pokemon4.equalsIgnoreCase(pokemonName)) {
            return 4;
        } else return 0;
    }

    public void startTimer(int slot) {
        int min = 1, max = 2;
        int hours = random.nextInt(max - min + 1) + min;
        LocalDateTime date = LocalDateTime.now();
        switch (slot) {
            case 1:
                cancelTimers(1);
                if(EnumRarePokemon.rarePokemon(Main.pokemon1)) {
                    min = 4;
                    max = 12;
                } else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon1)) {
                    min = 84;
                    max = 168;
                }
                hours = random.nextInt(max - min + 1) + min;
                date = date.plusHours(hours);
                Main.pokemon1expiry = date;
                Task task = Task.builder().execute(() -> {
                    Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o]\u00A7f The hunt for \u00A7a" + Main.pokemon1 + " \u00A7fhas ended!"));
                    randomisePokemon(slot);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o]\u00A7f New Pok\u00E9mon to hunt is \u00A7a" + Main.pokemon1 +"\u00A7f!"));

                })
                        .delay(hours, TimeUnit.HOURS)
                        .name(slot + "HuntTimer")
                        .submit(Main.getInstance());
                break;
            case 2:
                cancelTimers(2);
                if(EnumRarePokemon.rarePokemon(Main.pokemon2)) {
                    min = 4;
                    max = 12;
                } else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon2)) {
                    min = 84;
                    max = 168;
                }
                hours = random.nextInt(max - min + 1) + min;
                date = date.plusHours(hours);
                Main.pokemon2expiry = date;
                Task task2 = Task.builder().execute(() -> {
                    Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o]\u00A7f The hunt for \u00A7a" + Main.pokemon2 + " \u00A7fhas ended!"));
                    randomisePokemon(slot);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o]\u00A7f New Pok\u00E9mon to hunt is \u00A7a" + Main.pokemon2+"\u00A7f!"));
                })
                        .delay(hours, TimeUnit.HOURS)
                        .name(slot + "HuntTimer")
                        .submit(Main.getInstance());
                break;
            case 3:
                cancelTimers(3);
                if(EnumRarePokemon.rarePokemon(Main.pokemon3)) {
                    min = 4;
                    max = 12;
                } else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon3)) {
                    min = 84;
                    max = 168;
                }
                hours = random.nextInt(max - min + 1) + min;
                date = date.plusHours(hours);
                Main.pokemon3expiry = date;
                Task task3 = Task.builder().execute(() -> {
                    Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o]\u00A7f The hunt for \u00A7a" + Main.pokemon3 + " \u00A7fhas ended!"));
                    randomisePokemon(slot);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o]\u00A7f New Pok\u00E9mon to hunt is \u00A7a" + Main.pokemon3+"\u00A7f!"));
                })
                        .delay(hours, TimeUnit.HOURS)
                        .name(slot + "HuntTimer")
                        .submit(Main.getInstance());
                break;
            case 4:
                cancelTimers(4);
                if(EnumRarePokemon.rarePokemon(Main.pokemon4)) {
                    min = 4;
                    max = 12;
                } else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon4)) {
                    min = 84;
                    max = 168;
                }
                hours = random.nextInt(max - min + 1) + min;
                date = date.plusHours(hours);
                Main.pokemon4expiry = date;
                Task task4 = Task.builder().execute(() -> {
                    Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o]\u00A7f The hunt for \u00A7a" + Main.pokemon4 + " \u00A7fhas ended!"));
                    randomisePokemon(slot);
                    Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o]\u00A7f New Pok\u00E9mon to hunt is \u00A7a" + Main.pokemon4+"\u00A7f!"));
                })
                        .delay(hours, TimeUnit.HOURS)
                        .name(slot + "HuntTimer")
                        .submit(Main.getInstance());
                break;
        }
    }

    public void cancelTimers(int slot) {
        if(slot == 0) {
            Set<Task> tasks = Sponge.getScheduler().getTasksByName(1 + "HuntTimer");
            tasks.addAll(Sponge.getScheduler().getTasksByName(2 + "HuntTimer"));
            tasks.addAll(Sponge.getScheduler().getTasksByName(3 + "HuntTimer"));
            tasks.addAll(Sponge.getScheduler().getTasksByName(4 + "HuntTimer"));
            for (Task t : tasks) {
                t.cancel();
            }
        } else {
            Set<Task> tasks = Sponge.getScheduler().getTasksByName(slot + "HuntTimer");
            for (Task t : tasks) {
                t.cancel();
            }
        }
    }

    public void initialisePokemon() {
        cancelTimers(0);
        Main.pokemon1 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
        while(EnumEvolutionPokemon.doesntSpawnNaturally(Main.pokemon1)) Main.pokemon1 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
        Main.nature1 = randomEnum(EnumNature.class).toString();
        Main.nature1b = randomEnum(EnumNature.class).toString();
        while(Main.nature1b.equalsIgnoreCase(Main.nature1)) Main.nature1b = randomEnum(EnumNature.class).toString();
        Main.nature1c = randomEnum(EnumNature.class).toString();
        while(Main.nature1c.equalsIgnoreCase(Main.nature1b) || Main.nature1c.equalsIgnoreCase(Main.nature1)) Main.nature1c = randomEnum(EnumNature.class).toString();
        Main.pokemon1ballReward = randomBall(1, 0);
        Main.pokemon1moneyReward = randomMoney(0);
        if(EnumRarePokemon.rarePokemon(Main.pokemon1)) {
            Main.pokemon1moneyReward = randomMoney(1);
            Main.pokemon1rc = randomRareCandy(1);
        }
        else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon1)) {
            Main.pokemon1moneyReward = randomMoney(2);
            Main.pokemon1rc = randomRareCandy(2);
        }
        else Main.pokemon1rc = randomRareCandy(0);
        startTimer(1);
        Main.pokemon2 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
        while(EnumEvolutionPokemon.doesntSpawnNaturally(Main.pokemon2)) Main.pokemon2 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
        Main.nature2 = randomEnum(EnumNature.class).toString();
        Main.nature2b = randomEnum(EnumNature.class).toString();
        while(Main.nature2b.equalsIgnoreCase(Main.nature2)) Main.nature2b = randomEnum(EnumNature.class).toString();
        Main.nature2c = randomEnum(EnumNature.class).toString();
        while(Main.nature2c.equalsIgnoreCase(Main.nature2b) || Main.nature2c.equalsIgnoreCase(Main.nature2)) Main.nature2c = randomEnum(EnumNature.class).toString();
        Main.pokemon2ballReward = randomBall(2, 0);
        Main.pokemon2moneyReward = randomMoney(0);
        if(EnumRarePokemon.rarePokemon(Main.pokemon2)) {
            Main.pokemon2moneyReward = randomMoney(1);
            Main.pokemon2rc = randomRareCandy(1);
        }
        else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon2)) {
            Main.pokemon2moneyReward = randomMoney(2);
            Main.pokemon2rc = randomRareCandy(2);
        }
        else Main.pokemon2rc = randomRareCandy(0);
        startTimer(2);
        Main.pokemon3 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
        while(EnumEvolutionPokemon.doesntSpawnNaturally(Main.pokemon3)) Main.pokemon3 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
        Main.nature3 = randomEnum(EnumNature.class).toString();
        Main.nature3b = randomEnum(EnumNature.class).toString();
        while(Main.nature3b.equalsIgnoreCase(Main.nature3)) Main.nature3b = randomEnum(EnumNature.class).toString();
        Main.nature3c = randomEnum(EnumNature.class).toString();
        while(Main.nature3c.equalsIgnoreCase(Main.nature3b) || Main.nature3c.equalsIgnoreCase(Main.nature3)) Main.nature3c = randomEnum(EnumNature.class).toString();
        Main.pokemon3ballReward = randomBall(3, 0);
        Main.pokemon3moneyReward = randomMoney(0);
        if(EnumRarePokemon.rarePokemon(Main.pokemon3)) {
            Main.pokemon3moneyReward = randomMoney(1);
            Main.pokemon3rc = randomRareCandy(1);
        }
        else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon3)) {
            Main.pokemon3moneyReward = randomMoney(2);
            Main.pokemon3rc = randomRareCandy(2);
        }
        else Main.pokemon3rc = randomRareCandy(0);
        startTimer(3);
        Main.pokemon4 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
        while(EnumEvolutionPokemon.doesntSpawnNaturally(Main.pokemon4)) Main.pokemon4 = sanitisePokemon(EnumPokemon.randomPoke(false).name);
        Main.nature4 = randomEnum(EnumNature.class).toString();
        Main.nature4b = randomEnum(EnumNature.class).toString();
        while(Main.nature4b.equalsIgnoreCase(Main.nature4)) Main.nature4b = randomEnum(EnumNature.class).toString();
        Main.nature4c = randomEnum(EnumNature.class).toString();
        while(Main.nature4c.equalsIgnoreCase(Main.nature4b) || Main.nature4c.equalsIgnoreCase(Main.nature4)) Main.nature4c = randomEnum(EnumNature.class).toString();
        Main.pokemon4ballReward = randomBall(4, 0);
        Main.pokemon4moneyReward = randomMoney(0);
        if(EnumRarePokemon.rarePokemon(Main.pokemon4)) {
            Main.pokemon4moneyReward = randomMoney(1);
            Main.pokemon4rc = randomRareCandy(1);
        }
        else if(EnumVeryRarePokemon.veryRarePokemon(Main.pokemon4)) {
            Main.pokemon4moneyReward = randomMoney(2);
            Main.pokemon4rc = randomRareCandy(2);
        }
        else Main.pokemon4rc = randomRareCandy(0);
        startTimer(4);
    }

    public BigDecimal randomMoney(int rarity) {
        Random rn = new Random();
        int min=500, max=2500;
        if(rarity == 1)  {
            min = 2500;
            max = 3500;
        } else if(rarity == 2)  {
            min = 5000;
            max = 7500;
        }
        BigDecimal total = BigDecimal.valueOf(rn.nextInt(max-min+1)+min);
        return total;
    }

    public ItemStack randomRareCandy(int rarity) {
        Random rn = new Random();
        int min=10, max=15;
        if(rarity == 1)  {
            min = 15;
            max = 20;
        }
        else if(rarity == 2)  {
            min = 20;
            max = 40;
        }
        ItemStack is = ItemStack.builder()
                .itemType(Type("pixelmon:rare_candy"))
                .quantity(rn.nextInt(max-min+1)+min)
                .build();
        return is;
    }

    public ItemStack randomBall(int slot, int rarity) {
        String name = randomEnum(EnumItems.class).toString();
        switch(slot) {
            case 1:
                switch(name) {
                    case "level_ball":
                        Main.pokemon1ballName = "Level Balls";
                        break;
                    case "moon_ball":
                        Main.pokemon1ballName = "Moon Balls";
                        break;
                    case "friend_ball":
                        Main.pokemon1ballName = "Friend Balls";
                        break;
                    case "love_ball":
                        Main.pokemon1ballName = "Love Balls";
                        break;
                    case "timer_ball":
                        Main.pokemon1ballName = "Timer Balls";
                        break;
                    case "nest_ball":
                        Main.pokemon1ballName = "Nest Balls";
                        break;
                    case "dive_ball":
                        Main.pokemon1ballName = "Dive Balls";
                        break;
                    case "luxury_ball":
                        Main.pokemon1ballName = "Luxury Balls";
                        break;
                    case "heal_ball":
                        Main.pokemon1ballName = "Heal Balls";
                        break;
                    case "dusk_ball":
                        Main.pokemon1ballName = "Dusk Balls";
                        break;
                    case "lure_ball":
                        Main.pokemon1ballName = "Lure Balls";
                        break;
                    case "sport_ball":
                        Main.pokemon1ballName = "Sport Balls";
                        break;
                    case "ultra_ball":
                        Main.pokemon1ballName = "Ultra Balls";
                        break;
                    case "poke_ball":
                        Main.pokemon1ballName = "Poke Balls";
                        break;
                    case "quick_ball":
                        Main.pokemon1ballName = "Quick Balls";
                        break;
                    case "heavy_ball":
                        Main.pokemon1ballName = "Heavy Balls";
                        break;
                    case "fast_ball":
                        Main.pokemon1ballName = "Fast Balls";
                        break;
                    case "repeat_ball":
                        Main.pokemon1ballName = "Repeat Balls";
                        break;
                    case "gs_ball":
                        Main.pokemon1ballName = "GS Balls";
                        break;
                    case "great_ball":
                        Main.pokemon1ballName = "Great Balls";
                        break;
                    case "master_ball":
                        Main.pokemon1ballName = "Master Balls";
                        break;
                    case "park_ball":
                        Main.pokemon1ballName = "Park Balls";
                        break;
                    default:
                        Main.pokemon1ballName = "??? Balls";
                        break;
                }
                break;
            case 2:
                switch(name) {
                    case "level_ball":
                        Main.pokemon2ballName = "Level Balls";
                        break;
                    case "moon_ball":
                        Main.pokemon2ballName = "Moon Balls";
                        break;
                    case "friend_ball":
                        Main.pokemon2ballName = "Friend Balls";
                        break;
                    case "love_ball":
                        Main.pokemon2ballName = "Love Balls";
                        break;
                    case "timer_ball":
                        Main.pokemon2ballName = "Timer Balls";
                        break;
                    case "nest_ball":
                        Main.pokemon2ballName = "Nest Balls";
                        break;
                    case "dive_ball":
                        Main.pokemon2ballName = "Dive Balls";
                        break;
                    case "luxury_ball":
                        Main.pokemon2ballName = "Luxury Balls";
                        break;
                    case "heal_ball":
                        Main.pokemon2ballName = "Heal Balls";
                        break;
                    case "dusk_ball":
                        Main.pokemon2ballName = "Dusk Balls";
                        break;
                    case "lure_ball":
                        Main.pokemon2ballName = "Lure Balls";
                        break;
                    case "sport_ball":
                        Main.pokemon2ballName = "Sport Balls";
                        break;
                    case "ultra_ball":
                        Main.pokemon2ballName = "Ultra Balls";
                        break;
                    case "poke_ball":
                        Main.pokemon2ballName = "Poke Balls";
                        break;
                    case "quick_ball":
                        Main.pokemon2ballName = "Quick Balls";
                        break;
                    case "heavy_ball":
                        Main.pokemon2ballName = "Heavy Balls";
                        break;
                    case "fast_ball":
                        Main.pokemon2ballName = "Fast Balls";
                        break;
                    case "repeat_ball":
                        Main.pokemon2ballName = "Repeat Balls";
                        break;
                    case "gs_ball":
                        Main.pokemon2ballName = "GS Balls";
                        break;
                    case "great_ball":
                        Main.pokemon2ballName = "Great Balls";
                        break;
                    case "master_ball":
                        Main.pokemon2ballName = "Master Balls";
                        break;
                    case "park_ball":
                        Main.pokemon2ballName = "Park Balls";
                        break;
                    default:
                        Main.pokemon2ballName = "??? Balls";
                        break;
                }
                break;
            case 3:
                switch(name) {
                    case "level_ball":
                        Main.pokemon3ballName = "Level Balls";
                        break;
                    case "moon_ball":
                        Main.pokemon3ballName = "Moon Balls";
                        break;
                    case "friend_ball":
                        Main.pokemon3ballName = "Friend Balls";
                        break;
                    case "love_ball":
                        Main.pokemon3ballName = "Love Balls";
                        break;
                    case "timer_ball":
                        Main.pokemon3ballName = "Timer Balls";
                        break;
                    case "nest_ball":
                        Main.pokemon3ballName = "Nest Balls";
                        break;
                    case "dive_ball":
                        Main.pokemon3ballName = "Dive Balls";
                        break;
                    case "luxury_ball":
                        Main.pokemon3ballName = "Luxury Balls";
                        break;
                    case "heal_ball":
                        Main.pokemon3ballName = "Heal Balls";
                        break;
                    case "dusk_ball":
                        Main.pokemon3ballName = "Dusk Balls";
                        break;
                    case "lure_ball":
                        Main.pokemon3ballName = "Lure Balls";
                        break;
                    case "sport_ball":
                        Main.pokemon3ballName = "Sport Balls";
                        break;
                    case "ultra_ball":
                        Main.pokemon3ballName = "Ultra Balls";
                        break;
                    case "poke_ball":
                        Main.pokemon3ballName = "Poke Balls";
                        break;
                    case "quick_ball":
                        Main.pokemon3ballName = "Quick Balls";
                        break;
                    case "heavy_ball":
                        Main.pokemon3ballName = "Heavy Balls";
                        break;
                    case "fast_ball":
                        Main.pokemon3ballName = "Fast Balls";
                        break;
                    case "repeat_ball":
                        Main.pokemon3ballName = "Repeat Balls";
                        break;
                    case "gs_ball":
                        Main.pokemon3ballName = "GS Balls";
                        break;
                    case "great_ball":
                        Main.pokemon3ballName = "Great Balls";
                        break;
                    case "master_ball":
                        Main.pokemon3ballName = "Master Balls";
                        break;
                    case "park_ball":
                        Main.pokemon3ballName = "Park Balls";
                        break;
                    default:
                        Main.pokemon3ballName = "??? Balls";
                        break;
                }
                break;
            case 4:
                switch(name) {
                    case "level_ball":
                        Main.pokemon4ballName = "Level Balls";
                        break;
                    case "moon_ball":
                        Main.pokemon4ballName = "Moon Balls";
                        break;
                    case "friend_ball":
                        Main.pokemon4ballName = "Friend Balls";
                        break;
                    case "love_ball":
                        Main.pokemon4ballName = "Love Balls";
                        break;
                    case "timer_ball":
                        Main.pokemon4ballName = "Timer Balls";
                        break;
                    case "nest_ball":
                        Main.pokemon4ballName = "Nest Balls";
                        break;
                    case "dive_ball":
                        Main.pokemon4ballName = "Dive Balls";
                        break;
                    case "luxury_ball":
                        Main.pokemon4ballName = "Luxury Balls";
                        break;
                    case "heal_ball":
                        Main.pokemon4ballName = "Heal Balls";
                        break;
                    case "dusk_ball":
                        Main.pokemon4ballName = "Dusk Balls";
                        break;
                    case "lure_ball":
                        Main.pokemon4ballName = "Lure Balls";
                        break;
                    case "sport_ball":
                        Main.pokemon4ballName = "Sport Balls";
                        break;
                    case "ultra_ball":
                        Main.pokemon4ballName = "Ultra Balls";
                        break;
                    case "poke_ball":
                        Main.pokemon4ballName = "Poke Balls";
                        break;
                    case "quick_ball":
                        Main.pokemon4ballName = "Quick Balls";
                        break;
                    case "heavy_ball":
                        Main.pokemon4ballName = "Heavy Balls";
                        break;
                    case "fast_ball":
                        Main.pokemon4ballName = "Fast Balls";
                        break;
                    case "repeat_ball":
                        Main.pokemon4ballName = "Repeat Balls";
                        break;
                    case "gs_ball":
                        Main.pokemon4ballName = "GS Balls";
                        break;
                    case "great_ball":
                        Main.pokemon4ballName = "Great Balls";
                        break;
                    case "master_ball":
                        Main.pokemon4ballName = "Master Balls";
                        break;
                    case "park_ball":
                        Main.pokemon4ballName = "Park Balls";
                        break;
                    default:
                        Main.pokemon4ballName = "??? Balls";
                        break;
                }
                break;
        }

        Random rn = new Random();
        int min=10, max=18;
        if(rarity == 1) {
            min = 15;
            max = 25;
        }
        else if(rarity == 2) {
            min = 32;
            max = 64;
        }
        ItemStack is = ItemStack.builder()
                .itemType(Type("pixelmon:"+name))
                .quantity(rn.nextInt(max-min+1)+min)
                .build();
        return is;
    }

    public ItemType Type(String item) {
        ItemType i = Sponge.getGame().getRegistry().getType(ItemType.class,item).get();
        return i;
    }
}
