//game store
// 1. Buyer
// 2. Seller

// --BUYER--
// 1. ATM
// 2. Buy Game

// --SELLER--
//1. add game (input, rak berapa)
//2. see collection (for)
//3. update game (cond name / price)
//4. delete game (name -> "" & price -> 0)

//py = append
//c++ = pushback

import java.util.Scanner;

public class array {

    //array
    static String[] steam = new String[9];
    static int[] price = new int[9];
    static int harga_game,rak,update,user,action,ATM,money,add_money;

    public static void main(String[] args)
    {

        Scanner ask = new Scanner(System.in);
        System.out.print ("\033[H\033[2J");
        System.out.flush();

        while (true)
        {
            System.out.println("Welcome to Game Store");
            System.out.println("1. Buyer");
            System.out.println("2. Seller");
            user = ask.nextInt();
            if (user == 1)
            {
                while (true)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("1. ATM");
                    System.out.println("2. Buy Game");
                    System.out.println("3. Back");
                    action = ask.nextInt();
                    if (action == 1)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("1. Tambah uang");
                        System.out.println("2. Cek rekening");
                        ATM = ask.nextInt();
                        ask.nextLine();
                        if (ATM == 1)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            money = 0;
                            System.out.println("Deposit your money : ");
                            add_money = ask.nextInt();
                            money = 0 + add_money;
                            try {
                            Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Money Added");
                            try {
                            Thread.sleep(2000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                        }
                        else if (ATM == 2)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Balance : "+money);
                            System.out.println("0. Back");
                            int back = ask.nextInt();
                            if (back == 0)
                            {
                                System.out.print ("\033[H\033[2J");
                                System.out.flush();
                            }
                        }
                    }
                    else if (action == 2)
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
                                System.out.println((a+1)+". "+steam[a]+" - "+price[a]);    
                            }
                        }
                        System.out.println("Pilih game : ");
                        rak = ask.nextInt();
                        ask.nextLine();
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        
                        money = money - price[rak - 1];
                        System.out.println("Balance = "+money);
                        System.out.println("Game Bought");
                        try {
                        Thread.sleep(4000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }
                        
                    }
                    else if (action == 3)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        break;
                    }
                }
            }

            else if (user == 2)
            {
                while (true)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Game Store");
                    System.out.println("1. Add Game");
                    System.out.println("2. See Collection");
                    System.out.println("3. Update Game");
                    System.out.println("4. Delete Game");
                    System.out.println("0. Quit Store");

                    action = ask.nextInt();

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
                                System.out.println((a+1)+". "+steam[a]+" - "+price[a]);    
                            }
                        }
                        System.out.println("Pilih rak : ");
                        rak = ask.nextInt();
                        ask.nextLine();
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Nama game : ");
                        String game = ask.nextLine();
                        System.out.println("Berapa harga game : ");
                        harga_game = ask.nextInt();
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        steam[rak - 1] = game;
                        price[rak - 1] = harga_game;
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
                                System.out.println((i+1)+". "+steam[i]+" - "+price[i]);
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

                    else if (action == 3)
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
                                System.out.println((a+1)+". "+steam[a]+" - "+price[a]);    
                            }
                        }
                        System.out.println("Pilih rak : ");
                        rak = ask.nextInt();
                        ask.nextLine();
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("1. Update Collection");
                        System.out.println("2. Update Price");
                        System.out.println("=");
                        update = ask.nextInt();
                        ask.nextLine();

                        if(update == 1)
                        {
                            System.out.println("Nama game : ");
                            String game = ask.nextLine();
                            System.out.println("Berapa harga game : ");
                            harga_game = ask.nextInt();
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();

                            steam[rak - 1] = game;
                            price[rak - 1] = harga_game;
                            System.out.println("Game updated");

                            System.out.println("-------------------");
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
                        else if (update == 2)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Enter new price : ");
                            harga_game = ask.nextInt();
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();

                            price [rak - 1] = harga_game;
                            System.out.println("Price updated");

                            System.out.println("------------------");
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
                    }

                    else if (action == 4)
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
                                System.out.println((a+1)+". "+steam[a]+" - "+price[a]);    
                            }
                        }
                        System.out.println("Pilih rak : ");
                        rak = ask.nextInt();
                        ask.nextLine();
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        steam[rak - 1] = null;
                        price[rak - 1] = 0;

                        System.out.println("Game berhasil dihapus");
                        System.out.println("----------------------------");

                        try {
                        Thread.sleep(2000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }

                    }

                    else if (action == 0)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Thank you");
                        break;
                    }   
                }
                
            }
        }
        
        






        


            
        
    }
}
