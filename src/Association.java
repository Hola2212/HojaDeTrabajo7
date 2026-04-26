public class Association implements Comparable<Association> {
    private String palabraIngles;
    private String palabraEspaniol;

    public Association(String ingles, String espaniol){
        this.palabraIngles = ingles;
        this.palabraEspaniol = espaniol;
    }
    public void setPalabraIngles(String ingles){
        this.palabraIngles = ingles;
    }
    public void setPalabraEspaniol(String espaniol){
        this.palabraEspaniol = espaniol;
    }
    public String getPalabraIngles(){
        return this.palabraIngles;
    }
    public String getPalabraEspaniol(){
        return this.palabraEspaniol;
    }
    @Override
    public int compareTo(Association otraIngles){
        // 0 : this.palabraIngles == otraIngles
        // 0 > : this.palabraIngles < otraIngles (negativo)
        // 0 < : this.palabraIngles > otraIngles (positivo)
        return this.palabraIngles.compareToIgnoreCase(otraIngles.getPalabraIngles());
    }
}