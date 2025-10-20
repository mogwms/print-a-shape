public class SimpleShape{
    
    public static void createSquare() 
    {   
        for (int num = 0; num < 3; num += 1) {
            System.out.println(" ****** ");
        }
    }

    public static void createTriangle() 
    {   
        System.out.println("      *      ");
        System.out.println("     ***     ");
        System.out.println("    *****    ");
        System.out.println("   *******   ");
        System.out.println("  *********  ");
        System.out.println(" *********** ");
    }

    public static void createCircle() 
    {   
        System.out.println("            *****            ");
        System.out.println("        ************         ");
        System.out.println("      *****************      ");
        System.out.println("     *******************     ");
        System.out.println("    *********************    ");
        System.out.println("     *******************     ");
        System.out.println("      *****************      ");
        System.out.println("         ************        ");
        System.out.println("            *****            ");
    }

    public static void createRectangle() 
    {   
          for (int num = 0; num < 6; num += 1) {
            System.out.println(" ****************************** ");
        }
    }


    public static void main(String[] args) {
        System.out.println(" ");
        createSquare();
        System.out.println(" ");
        createTriangle();
        System.out.println(" ");
        createRectangle();
        System.out.println(" ");
        createCircle();
    }
}
