class Pet {
    private int count = 10;
    private int n = 0;
    private String[] Arr = new String[count];
    void push(String element){
        if (n == getArr().length - 1){
            resize();
        }
        Arr[n++] = element;
    }
    private void resize(){
        String[] newArr = new String[count*2];
        this.count*=2;
        if (n >= 0) System.arraycopy(Arr, 0, newArr, 0, n);
        Arr = newArr;
    }
    String[] getArr(){
        return Arr;
    }
}
