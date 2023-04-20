public class ThrowExeption{
    public static void throwExeption() throws MyExeption {
        throw  new MyExeption("Не хватит топлива"," заправьте бак");

    }
    public static void errorRoud() throws MyExeption {
        throw  new MyExeption("Зашрузка/Погрузка не возможна, поезд в пути "," поезд в в пути");
    }
    public static void errorloiding() throws MyExeption {
        throw  new MyExeption("Загрузка не возможна"," поезд уже загружен ");
    }

    public static void errorunloiding() throws MyExeption {
        throw  new MyExeption("Разгрузка не возможна"," поезд пустой ");
    }

}
