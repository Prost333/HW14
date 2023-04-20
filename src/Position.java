public enum Position {

    ISEMPTY("Разгружается"),
    ISFUEL("Загружается");




  private  String word;
  Position(String word){
      this.word=word;
  }

    @Override
    public String toString() {
        return  word;
    }
}
