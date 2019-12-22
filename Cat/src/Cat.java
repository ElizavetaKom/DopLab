class Cat extends Pet {
    private Pet cat = new Pet();
    void push(String elem){
        cat.push(elem);
    }
    String[] getCats(){
        return cat.getArr();
    }
}
