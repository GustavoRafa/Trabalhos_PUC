package Musica;
  
class Musica{    
    private String id, nome, key, artists;
    private int realease_date;
    private double acousticness, danceability, energy,instrumentalness,valence,liveness, loudness, speechiness;
    private int duration_ms, popularity, year;
    private float tempo;
    
    public static boolean isFim(String s){
        return(s.length()>= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public Musica(){
        this.id = "";
        this.nome = "";
        this.key = "";
        this.artists = "";
        this.realease_date = 0;
        this.acousticness = 0;
        this.danceability = 0;
        this.energy = 0 ;   
        this.instrumentalness = 0;
        this.valence = 0;
        this.liveness = 0;
        this.loudness = 0;
        this.speechiness = 0;
        this.duration_ms = 0;
        this.popularity = 0;
        this.year = 0;   
        this.tempo = 0;   
    } 
    
    public Musica(String id, String nome, String key, String artists, int realease_date, double acousticness, double danceability, 
    double energy, double instrumentalness, double valence, double liveness, double loudness, double speechiness, int duration_ms, int popularity, int year, float tempo){
        this.id = id;
        this.nome = nome;
        this.key = key;
        this.artists = artists;
        this.realease_date = realease_date;
        this.acousticness = acousticness;
        this.danceability = danceability;
        this.energy = energy;  
        this.instrumentalness = instrumentalness;
        this.valence = valence;
        this.liveness = liveness;
        this.loudness = loudness;
        this.speechiness = speechiness;
        this.duration_ms = duration_ms;
        this.popularity = popularity;
        this.year = year;  
        this.tempo = tempo;  
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getArtists() {
        return this.artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public int getRealease_date() {
        return this.realease_date;
    }

    public void setRealease_date(int realease_date) {
        this.realease_date = realease_date;
    }

    public double getAcousticness() {
        return this.acousticness;
    }

    public void setAcousticness(double acousticness) {
        this.acousticness = acousticness;
    }

    public double getDanceability() {
        return this.danceability;
    }

    public void setDanceability(double danceability) {
        this.danceability = danceability;
    }

    public double getEnergy() {
        return this.energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getInstrumentalness() {
        return this.instrumentalness;
    }

    public void setInstrumentalness(double instrumentalness) {
        this.instrumentalness = instrumentalness;
    }

    public double getValence() {
        return this.valence;
    }

    public void setValence(double valence) {
        this.valence = valence;
    }

    public double getLiveness() {
        return this.liveness;
    }

    public void setLiveness(double liveness) {
        this.liveness = liveness;
    }

    public double getLoudness() {
        return this.loudness;
    }

    public void setLoudness(double loudness) {
        this.loudness = loudness;
    }

    public double getSpeechiness() {
        return this.speechiness;
    }

    public void setSpeechiness(double speechiness) {
        this.speechiness = speechiness;
    }

    public int getDuration_ms() {
        return this.duration_ms;
    }

    public void setDuration_ms(int duration_ms) {
        this.duration_ms = duration_ms;
    }

    public int getPopularity() {
        return this.popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getTempo() {
        return this.tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public Musica clone(){
        return new Musica(this.id,this.nome,this.key,this.artists,this.realease_date,this.acousticness,this.danceability,this.energy,this.instrumentalness,this.valence,this.liveness,this.loudness,this.speechiness,this.duration_ms,this.popularity,this.year,this.tempo);
    }
    
    public void ler(String s){
        String[] array = s.split(",");   
        String linha = "";
        //String artists[] = values[3].split("#");

        //this.nome = array[1].replace("*","");

        this.id = array[0];
        this.nome = array[1];
        this.key = array[2];
        if(linha.contains("\"[")){
            linha = linha.replace("\"['", "");
            linha = linha.replace("']\"","");
            linha = linha.replace("', '","#");
        }
        else if(linha.contains("['")){
            linha = linha.replace("['","");
            linha = linha.replace("']","");
        }
        array[3] = linha;
        this.artists = array[3];
        this.realease_date = Integer.parseInt(array[4]);
        this.acousticness = Integer.parseInt(array[5]);
        this.danceability = Integer.parseInt(array[6]);
        this.energy = Integer.parseInt(array[7]);
        this.duration_ms = Integer.parseInt(array[8]);
        this.instrumentalness = Integer.parseInt(array[9]);
        this.valence = Integer.parseInt(array[10]);
        this.popularity = Integer.parseInt(array[11]);
        this.tempo = Integer.parseInt(array[12]);
        this.liveness = Integer.parseInt(array[13]);
        this.loudness = Integer.parseInt(array[14]);
        this.speechiness = Integer.parseInt(array[15]);
        this.year = Integer.parseInt(array[16]);

    }

    public void imprimir(){
        System.out.println(getId()+" ## "+getArtists()+" ## "+getNome()+" ## "+getRealease_date()+" ## "+getAcousticness()+" ## "+getDanceability()+" ## "+getEnergy()+" ## "+getDuration_ms()+" ## "+getInstrumentalness()+" ## "+getValence()+" ## "+getPopularity()+" ## "+getTempo()+" ## "+getLiveness()+" ## "+getLoudness()+" ## "+getSpeechiness()+" ## "+getYear());
    }
    
    public static void log(int comp , long tempo){
        Arq.openWrite("693795_sequencial.txt");

        Arq.print("693795"+'\t'+tempo+'\t'+comp);

        Arq.close();
    }

    public static void main(String[] args){
        MyIO.println("teste");
        String[] entrada = new String[1000];
        String[] nomes = new String[1000];
        int numEntrada = 0;
        int numNomes = 0;
        int comparacoes = 0;

        MyIO.println("teste");
        do{ 
            entrada[numEntrada] = MyIO.readLine();
        }while(isFim(entrada[numEntrada++]) == false);
        numEntrada--;

        Musica[] musica = new Musica[1000];
        String[] leitura = new String [5000];

        Arq.openRead("/tmp/data.csv");

        for (int i = 0 ; i<3923; i++){
            leitura[i]= Arq.readLine();
        } 
        
        Arq.close();

        int x;
        for(int i = 0; i<numEntrada; i++){
            x = Integer.parseInt(entrada[i]);
            musica[i] = new Musica();
            musica[i].ler(leitura[x+1]);
        }

        do{
            nomes[numNomes]= MyIO.readLine();
        }while(isFim(nomes[numNomes++]) == false);
        numNomes--;
      
        long tempoinicio = System.currentTimeMillis();

        int encontrado;
        for(int i = 0 ; i < numNomes ; i++){
            encontrado = 0;
            for(int j = 0 ; j<numEntrada ; j++){
                if(nomes[i].contains(musica[j].getNome())){
                    comparacoes++;
                    encontrado = 1;
                    j+=numEntrada;
                }
            }
            if(encontrado == 0){
                System.out.println("NAO");
            }else if (encontrado == 1){
                System.out.println("SIM");
            }
            
        }
        
        long tempo = System.currentTimeMillis() - tempoinicio;

        log(comparacoes , tempo);

    }
}
