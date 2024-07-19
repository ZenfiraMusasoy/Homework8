package test;

public class Main {
    public static void main(String[] args) {
      try {
          doJob();
      } catch (NullPointerException npe ) {
          npe.printStackTrace();
      } catch (Exception ex) {
          ex.printStackTrace();
      } finally {
          System.out.println("Hello world");
      }
    }

    private static String doJob() throws NullPointerException {
        throw new NullPointerException();
    }
}