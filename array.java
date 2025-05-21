//game store
//1. add game (input, rak berapa)
//2. see collection (for)

//py = append
//c++ = pushback

import java.util.Scanner;

public class array {

    //array
    static String[] steam = new String[9];
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.print ("\033[H\033[2J");
        System.out.flush();

        while (true)
        {
            System.out.println("Game Store");
            System.out.println("1. Add Game");
            System.out.println("2. See Collection");

            int action = ask.nextInt();

            if (action == 1)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();
                for (int a = 0; a<steam.length; a = a+1)
                {
                    if (steam[a] == null)
                    {
                        System.out.println((a+1)+". "+"Kosong");
                    }
                    else
                    {
                        System.out.println((a+1)+". "+steam[a]);    
                    }
                }
                System.out.println("Pilih rak : ");
                int rak = ask.nextInt();
                ask.nextLine();
                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("Nama game : ");
                String game = ask.nextLine();
                System.out.print ("\033[H\033[2J");
                System.out.flush();

                steam[rak - 1] = game;
                System.out.println("Game added");

                System.out.println("----------");
                System.out.println("1. Continue\n2. Exit");

                int menu = ask.nextInt();
                if (menu == 1)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    continue;
                }
                else if (menu == 2)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Thank you");
                    break;
                }
            }

            else if (action == 2)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();
                for (int i = 0; i < steam.length; i = i+1)
                {
                    if (steam[i] == null)
                    {
                        System.out.println((i+1)+". "+"Kosong");
                    }
                    else
                    {
                        System.out.println((i+1)+". "+steam[i]);
                    }
                    
                }
                System.out.println("-------------------");
                System.out.println("1. Back");
                int back = ask.nextInt();
                if (back == 1)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                }
            }
        }
        
    }
}
