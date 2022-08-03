import com.mcserby.training.refactoring.InternationalValues;
import com.mcserby.training.refactoring.Locale;
import com.mcserby.training.refactoring.Translation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Mapper {

    private static List<Translation> mapNames(List<InternationalValues> values) {
        String name = values.stream().map(iv -> iv.getDetails("Uk").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfUk = new Translation(Collections.singletonList(name), "en_uk");
        String nameNl = values.stream().map(iv -> iv.getDetails("Nl").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfNl = new Translation(Collections.singletonList(nameNl), "nl");
        String nameDe = values.stream().map(iv -> iv.getDetails("De").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfDe = new Translation(Collections.singletonList(nameDe), "de");
        String nameFr = values.stream().map(iv -> iv.getDetails("Fr").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfFr = new Translation(Collections.singletonList(nameFr), "fr");
        String nameEs = values.stream().map(iv -> iv.getDetails("Es").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfEs = new Translation(Collections.singletonList(nameEs), "es");
        String nameIt = values.stream().map(iv -> iv.getDetails("It").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfIt = new Translation(Collections.singletonList(nameIt), "it");
        String nameAt = values.stream().map(iv -> iv.getDetails("At").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfAt = new Translation(Collections.singletonList(nameAt), "at");
        String nameChFr = values.stream().map(iv -> iv.getDetails("ChFr").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfCh = new Translation(Collections.singletonList(nameChFr), "ch_fr");
        String nameChDe = values.stream().map(iv -> iv.getDetails("ChDe").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfChDe = new Translation(Collections.singletonList(nameChDe), "ch_de");
        String nameChIt = values.stream().map(iv -> iv.getDetails("ChIt").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfChIt = new Translation(Collections.singletonList(nameChIt), "ch_it");
        String nameBeFr = values.stream().map(iv -> iv.getDetails("BeFr").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfBeFr = new Translation(Collections.singletonList(nameBeFr), "be_fr");
        String nameLuDe = values.stream().map(iv -> iv.getDetails("LuDe").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfLu = new Translation(Collections.singletonList(nameLuDe), "lux_de");
        String nameCaEs = values.stream().map(iv -> iv.getDetails("CaEs").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfCa = new Translation(Collections.singletonList(nameCaEs), "es_ca");
        String nameLuFr = values.stream().map(iv -> iv.getDetails("LuFr").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfLuFr = new Translation(Collections.singletonList(nameLuFr), "lux_fr");
        return Arrays.asList(psfUk, psfNl, psfDe, psfFr, psfEs, psfIt, psfAt, psfCh, psfChDe, psfChIt, psfBeFr, psfLu, psfCa, psfLuFr);
    }

    private static List<Translation> mapDescriptions(List<InternationalValues> values) {
        String description = values.stream().map(iv -> iv.getDetails("Uk").getDescription()).findFirst().orElse("");
        Translation psfUk = new Translation(Collections.singletonList(description), "en_uk");
        String nameNl = values.stream().map(iv -> iv.getDetails("Nl").getDescription().substring(0, Math.min(iv.getDetails("Nl").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfNl = new Translation(Collections.singletonList(nameNl), "nl");
        String nameDe = values.stream().map(iv -> iv.getDetails("De").getDescription().substring(0, Math.min(iv.getDetails("De").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfDe = new Translation(Collections.singletonList(nameDe), "de");
        String nameFr = values.stream().map(iv -> iv.getDetails("Fr").getDescription().substring(0, Math.min(iv.getDetails("Fr").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfFr = new Translation(Collections.singletonList(nameFr), "fr");
        String nameEs = values.stream().map(iv -> iv.getDetails("Es").getDescription().substring(0, Math.min(iv.getDetails("Es").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfEs = new Translation(Collections.singletonList(nameEs), "es");
        String nameIt = values.stream().map(iv -> iv.getDetails("It").getDescription().substring(0, Math.min(iv.getDetails("It").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfIt = new Translation(Collections.singletonList(nameIt), "it");
        String nameAt = values.stream().map(iv -> iv.getDetails("At").getDescription().substring(0, Math.min(iv.getDetails("At").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfAt = new Translation(Collections.singletonList(nameAt), "at");
        String nameChFr = values.stream().map(iv -> iv.getDetails("ChFr").getDescription().substring(0, Math.min(iv.getDetails("ChFr").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfCh = new Translation(Collections.singletonList(nameChFr), "ch_fr");
        String nameChDe = values.stream().map(iv -> iv.getDetails("ChDe").getDescription().substring(0, Math.min(iv.getDetails("ChDe").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfChDe = new Translation(Collections.singletonList(nameChDe), "ch_de");
        String nameChIt = values.stream().map(iv -> iv.getDetails("ChIt").getDescription().substring(0, Math.min(iv.getDetails("ChIt").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfChIt = new Translation(Collections.singletonList(nameChIt), "ch_it");
        String nameBeFr = values.stream().map(iv -> iv.getDetails("BeFr").getDescription().substring(0, Math.min(iv.getDetails("BeFr").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfBeFr = new Translation(Collections.singletonList(nameBeFr), "be_fr");
        String nameLuDe = values.stream().map(iv -> iv.getDetails("LuDe").getDescription().substring(0, Math.min(iv.getDetails("LuDe").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfLu = new Translation(Collections.singletonList(nameLuDe), "lux_de");
        String nameCaEs = values.stream().map(iv -> iv.getDetails("CaEs").getDescription().substring(0, Math.min(iv.getDetails("CaEs").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfCa = new Translation(Collections.singletonList(nameCaEs),"es_ca");
        String nameLuFr = values.stream().map(iv -> iv.getDetails("LuFr").getDescription().substring(0, Math.min(iv.getDetails("LuFr").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfLuFr = new Translation(Collections.singletonList(nameLuFr), "lux_fr");
        return Arrays.asList(psfUk, psfNl, psfDe, psfFr, psfEs, psfIt, psfAt, psfCh, psfChDe, psfChIt, psfBeFr, psfLu, psfCa, psfLuFr);
    }
}
