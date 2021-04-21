
class Main {
  private static int[] aufstellung = { 1, 3, 5, 7, 8, 10, 11, 13, 14, 16, 19 };

  public static void main(String[] args) {
    System.out.println("Hello world!");
    for (int i = 0; i < aufstellung.length; i++) {
      System.out.println(aufstellung[i]);
    }
    binaereSuche(aufstellung, 6);

  }

  public static boolean binaereSuche(int[] a, int suchschlüssel) {
    int links, rechts, mitte;
    links = 0;
    rechts = aufstellung.length - 1;
    while (links <= rechts) {
      mitte = (rechts + links) / 2;
      if (a[mitte] == suchschlüssel) {
        System.out.println("Ist aufgestellt");
        return true;
      }
      if (a[mitte] < suchschlüssel) {
        links = mitte + 1;
      }
      if (a[mitte] > suchschlüssel) {
        rechts = mitte - 1;
      }
    }
    System.out.println("Ist nicht aufgestellt");
    return false;
  }

}
