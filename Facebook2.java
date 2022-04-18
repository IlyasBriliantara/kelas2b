public class Facebook2 {
    public String Komen;
    public String Nama;
    public String pin;
    private int Like;
    private int Share;

    public Facebook2 (String km , String nm){
        this.Komen = km;
        this.Nama = nm;
        this.Like = 0;
        this.Share = 0;
    }
    public int Suka (int jumlah){
        Like = Like + jumlah;
        return Like;
    }

    public int Bagi(int jumlah){
        Share = Share + jumlah;
        return Share;
    }
}
