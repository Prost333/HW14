public class ThrowExeptionHandl {
    public static void throwExeptionHandl() {
        try {
            ThrowExeption.throwExeption();
        } catch (MyExeption myExeption) {
            throw new MyExeption(myExeption.getMessage(), myExeption.getCode());
        }
    }

    public static void throwExeptionWay() {
        try {
            ThrowExeption.errorRoud();
        } catch (MyExeption myExeption) {
            throw new MyExeption(myExeption.getMessage(), myExeption.getCode());
        }
    }

    public static void throwExeptionloiding() {
        try {
            ThrowExeption.errorRoud();

        } catch (MyExeption myExeption) {
            throw new MyExeption(myExeption.getMessage(), myExeption.getCode());
        }
    }

    public static void throwExeptionunloiding() {
        try {
            ThrowExeption.errorunloiding();
        } catch (MyExeption myExeption) {
            throw new MyExeption(myExeption.getMessage(), myExeption.getCode());
        }
    }
}
