public enum Statys {
    EMPTY("Пустой"),
    FUEL("Полный"),
    INAWAY ("В ПУТИ");
    private  String word;
    Statys(String word){
        this.word=word;
    }

    @Override
    public String toString() {
        return word ;
    }
}
