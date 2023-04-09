package untils;

import java.util.Map;
import static java.util.Map.entry;

public class Msg {
    public static final String welcomeMsg = "Добро пожаловать в Зоопарк!\n";
    public static final String byeMsg = "До свидания!\n";
    public static final String chooseActionsMsg = "Что бы вы хотели сделать:";
    public static final String addAnimalMsg = """
           Вы можете добавить животное, сделайте выбор:
            1 - Кот
            2 - Собака
            3 - Тигр
            4 - Волк
            5 - Курица
            6 - Аист
            """;

    public static final String askAnimalClassMsg = "Какой тип животного? ";
    public static final String askAnimalHeightMsg = "Какой рост? ";
    public static final String askAnimalWeightMsg = "Какой вес? ";
    public static final String askAnimalEyeColorMsg = "Какой цвет глаз? ";
    public static final String askPetNameMsg = "Кличка животного? ";
    public static final String askPetBreedMsg = "Какая порода? ";
    public static final String askPetVaccinationsMsg = "Привито ли животное? ";
    public static final String askPetFurColorMsg = "Какой окрас? ";
    public static final String askPetBirthDaterMsg = "Дата рождения? ";
    public static final String askWildAnimalHabitatMsg = "Ареал обитания? ";
    public static final String askWildAnimalFoundDateMsg = "Дата обнаружения? ";
    public static final String askBirdFeathersColorMsg = "Какого цвета оперение? ";
    public static final String askBirdFlightAltitudeMsg = "Какая высота полета? ";
    public static final String askIsDogTrainedMsg = "Собака тренирована(ответ y / n)? ";
    public static final String askIsWolfLeaderdMsg = "Это вожак (ответ y / n)? ";
    public static final String askIsCatWoollyMsg = "Кот игривый (ответ y / n)? ";

    public static final String getIndexlMsg = "Введите цифру: ";
    public static final String getAnimalIDMsg = "Введите ID животного: ";
    public static final String invalidAnimalIDMsg = "Неправильный ID";
    public static final String incorrectInputMsg = "Это неправильный вариант, попробуйте еще разn!";
    public static final String cannotDoItMsg = "Это не сделать";

    public static final String animalWasAddedMsg = "Это животное было добавлено в зоопарк";
    public static final String animalNotAddedMsg = "Это животное не было добавлено в зоопарк";
    public static final String nobodyRemovedMsg = "Никто не был удален из зоопарка (неверный id)";
    public static final String animalWasRemovedMsg = "Животное убрали из зоопарка";

    public static final String nobodyLivesInZooMsg = "В зоопарке пока никто не живет";
    public static final String notImplementedMsg = "Это еще несделано";

    public static final String cannotFlyMsg = "Животное не летает";
    public static final String cannotPetMsg = "Животное нельзя гладить!";
    public static final String cannotTrainMsg = "Животное не дрессируется!";

    public static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Добавить новое животное в Зоопарк"),
            entry(2, "Убрать животное из Зоопарка"),
            entry(3, "Показать информацию об определенном животном"),
            entry(4, "Показать информацию о всех животных Зоопарка"),
            entry(5, "Воспроизвести звук определенного животного"),
            entry(6, "Воспроизвести звуки всех животных Зоопарка"),
            entry(7, "Посмотреть летающих животных"),
            entry(8, "Посмотреть домашних животных"),
            entry(9, "Посмотреть дрессированных животных"),
            entry(0, "Выйти из Зоопарка"));
}
