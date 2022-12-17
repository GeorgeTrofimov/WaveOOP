public class CatGame {
    public void Start() {
        System.out.println((char) 27 + "[31mЗадача с волновым алгоритмом! " + (char) 27 + "[0m");
        WaveAlgorithm lab = new WaveAlgorithm();
        lab.Create_GameField();
        System.out.println(lab);
        lab.StartPoint();
        System.out.println(lab);
        lab.exitPoint();
        lab.Wave();
        System.out.println(lab);
    }
}