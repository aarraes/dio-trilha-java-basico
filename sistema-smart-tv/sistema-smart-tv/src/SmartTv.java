public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  boolean modoMudo = false;
  int volumeMaximo = 100;
  int volumeMinimo = 0;
  int canalMaximo = 50;
  int canalMinimo = 1;
  int canalAtual = 1;
  int volumeAtual = 25;

  public void ligar() {
    ligada = true;
  }
  public void desligar() {
    ligada = false;
  }
  public void aumentarVolume() {
    if (!ligada){
      System.out.println("A TV está desligada. Não é possível aumentar o volume.");
      return;
    }
    if (volumeAtual < volumeMaximo && ligada) {
      volumeAtual++;
      System.out.println("Aumentando o volume para: " + volumeAtual);
      
    } else {
      System.out.println("Volume máximo atingido.");
    }
  }
  public void diminuirVolume() {
     if (!ligada){
      System.out.println("A TV está desligada. Não é possível diminuir o volume.");
      return;
    }
    if (volumeAtual > volumeMinimo) {
      volumeAtual--;
      System.out.println("Diminuindo o volume para: " + volumeAtual);
    } else {
      System.out.println("Volume mínimo atingido.");
    }
  }
  public void aumentarCanal() {
     if (!ligada){
      System.out.println("A TV está desligada. Não é possível aumentar o canal.");
      return;
    }
    if (canal < canalMaximo) {
      canal++;
      System.out.println("Aumentando o canal para: " + canal);
    } else {
      System.out.println("Canal máximo atingido.");
    }
  }
  public void diminuirCanal() {
    if (!ligada){
      System.out.println("A TV está desligada. Não é possível diminuir o canal.");
      return;
    }
    if (canal > canalMinimo) {
      canal--;
      System.out.println("Diminuindo o canal para: " + canal);
    } else {
      System.out.println("Canal mínimo atingido.");

    }
  }
    
}
