public interface IntSequence {
    public int next();
    
    public boolean hasNext();

    public static int[] of(int ... val){
        int[] vet = new int[val.length];
        for(int i=0; i < val.length; i++){
            vet[i] = val[i];
        }
        return vet;
    }
}
