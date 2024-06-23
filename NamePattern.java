import java.util.Scanner;

class NamePattern {


    static void A(){

        int i, j;
        for (i = 1; i <= 10; i++) {
            // for (j = 10 - i; j > 0; j--) {
            //     System.out.print(" ");
            // }
            // for(j = 1; j <= 3; j++){
            //     System.out.print("*");
            // }
            // for(j = 1; j < i; j++){
            //     if (i == 6 || i == 7) {
            //         System.out.print("*");
            //     }
            //     else{
            //         System.out.print(" ");
            //     }
            // }
            // for(j = 1; j < i; j++){
            //     if (i == 6 || i == 7) {
            //         System.out.print("*");
            //     }
            //     else{
            //         System.out.print(" ");
            //     }
            // }
            // for(j = 1; j <= 3; j++){
            //     System.out.print("*");
            // }

            for (j = 10 - i; j > 0; j--) {
                System.out.print(" ");
            }
            if(i > 3){
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
                for(j = 1; j <= (i+i)-7; j++){
                    if(i == 6 || i == 7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
            }
            else{
                for(j = 1; j <= (i+i)-1; j++){
                    System.out.print("*");
                }
            }


            System.out.println();
        }
    }

    static void B(){
        int i, j;

        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 10){
                    if(j < 16){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 2 || i == 9){
                    if(j < 17){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 3 || i == 4 || i == 7 || i == 8){
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else{
                    if(j < 17){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }

    static void C(){
        int i, j;

        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 10){
                    if(j > 2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 2 || i == 9){
                    if(j > 1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j < 4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void D(){
        int i, j;

        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 10){
                    if(j < 16){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 2 || i == 9){
                    if(j < 17){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j > 3 && j < 16){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    static void E(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 2 || i == 5 || i == 6 || i == 9 || i == 10){
                    System.out.print("*");
                }
                else{
                    if(j < 4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void F(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 2){
                    System.out.print("*");
                }
                else if(i == 5 || i == 6){
                    if (j < 15) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j < 4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void G(){
        int i, j;

        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 10){
                    if(j > 2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 2 || i == 9){
                    if(j > 1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 6 || i == 5){
                    if(j > 3 && j < 9){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 7 || i == 8){
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else{
                    if(j < 4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void H(){
        int i, j;

        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i > 4 && i < 7){
                    System.out.print("*");
                }
                else{
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    static void I(){
        int i, j;

        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i < 3 || i > 8){
                    System.out.print("*");
                }
                else{
                    if(j > 7 && j < 11){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void J(){
        int i, j;

        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i < 3){
                    System.out.print("*");
                }
                else if(i > 6 && i < 9){
                    if(j < 4 || j > 7 && j < 11){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 9){
                    if(j < 11){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 10){
                    if(j > 2 && j < 10){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j > 7 && j < 11){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void K(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 10){
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 2 || i == 9){
                    if(j > 3 && j < 12 || j > 14){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 3 || i == 8){
                    if(j > 3 && j < 12-3 || j > 14-3){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 4 || i == 7){
                    if(j > 3 && j < 12-3-3 || j > 14-3-3){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else {
                    if(j > 3 && j < 12-3-3-1 || j > 14-3-3-1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    static void L(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i < 9){
                    if(j < 4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void M(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1){
                    if(j > 6 && j < 12){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 2){
                    if(j > 7 && j < 11 || j == 4 || j == 14){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 3){
                    if(j > 8 && j < 10 || j > 3 && j < 6 || j > 12 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 4){
                    if(j > 3 && j < 8 || j > 10 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else {
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    static void N(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 3; j++){
                System.out.print("*");
            }
            for(j = 2; j <= i; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= 3; j++){
                System.out.print("*");
            }
            for(j = 10-i; j >= 1; j--){
                System.out.print(" ");
            }
            for(j = 1; j <= 3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void O(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 10){
                    if(j > 1 && j < 17){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 2 || i == 9){
                    System.out.print("*");
                }
                else{
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    static void P(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 6){
                    if(j < 17){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 2 || i == 5){
                    System.out.print("*");
                }
                else if(i > 2 && i < 5){
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else{
                    if(j > 3){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    static void Q(){
        int i, j;
        for(i = 1; i <= 11; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 10){
                    if(j > 1 && j < 17){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 2 || i == 9){
                    System.out.print("*");
                }
                else if(i == 7){
                    if(j > 3 && j < 10 || j > 12 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 8){
                    if(j > 3 && j < 11 || j > 13 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 11){
                    if(j > 13 && j < 17){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    static void R(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 1 || i == 6){
                    if(j < 17){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 2 || i == 5){
                    System.out.print("*");
                }
                else if(i > 2 && i < 5){
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else{
                    if(j > 3){
                        if(j < i + 1 + 4){
                            System.out.print(" ");
                        }
                        else if(j >= i + 1 + 4 && j < i + 1 + 4 + 3){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            // System.out.println();
            // if(i > 6){
            //     for(j = 1; j <= 3; j++){
            //         System.out.print("*");
            //     }
            //     for(j = 1; j < i+2; j++){
            //         System.out.print(" ");
            //     }
            //     for(j = 1; j <= 3; j++){
            //         System.out.print("*");
            //     }
            // }
            System.out.println();
        }
    }

    static void S(){
        int i, j;

        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){

                if(i == 1 || i == 10){
                    if(i == 1){
                        if(j > 2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    else{
                        if(j < 16){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
                else if(i == 2 || i == 9 || i == 5 || i ==6){
                    if(i == 2){
                        if(j > 1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    else if(i == 9){
                        if(j < 17){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    else if(i == 6){
                        if(j > 2 && j < 17){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    else {
                        if(j > 1 && j < 16){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
                else if(i > 2 && i < 5){
                    if(j > 3){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else{
                    if(j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    static void T(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i < 3){
                    System.out.print("*");
                }
                else{
                    if(j > 7 && j < 11){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    static void U(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 10){
                    if(j > 1 && j < 17){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i == 9){
                    System.out.print("*");
                }
                else{
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    static void V(){
        int i, j, k = 0;
        for(i = 1; i <= 10; i++){
            for(j = 1; j < i; j++){
                System.out.print(" ");
            }
            if(i < 8){
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
                for(j = 1; j <= 15-2*i; j++){ //13 11 9
                    System.out.print(" ");
                }
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
            }
            else {
                for(j = 1; j <= (i+i)-11-k; j++){
                    System.out.print("*");
                }
                k += 4;

            }
            System.out.println();
        }
    }
    static void W(){
        int i, j;
        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 17; j++){
                if(i == 10){
                    if(j > 6 && j < 12){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 9){
                    if(j > 7 && j < 11 || j == 4 || j == 14){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 8){
                    if(j > 8 && j < 10 || j > 3 && j < 6 || j > 12 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(i == 7){
                    if(j > 3 && j < 8 || j > 10 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else {
                    if(j > 3 && j < 15){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    static void X(){
        int i, j, k = 0;
        for(i = 1; i <= 10; i++){
            if(i < 5){
                for(j = 1; j < i; j++){
                    System.out.print(" ");
                }
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
                for(j = 1; j <= 13-(2*i); j++){
                    System.out.print(" ");
                }
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
            }
            else if(i == 5 || i == 6){
                for(j = 1; j < 5; j++){
                    System.out.print(" ");
                }
                for(j = 1; j <= 9; j++){
                    System.out.print("*");
                }
            }
            else{
                for(j = 1; j <= i-4-k; j++){
                    System.out.print(" ");
                }
                k += 2;
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
                for(j = 1; j < (i + i) - 9; j++){ // 7-5 8-7 9-9 10-11
                    System.out.print(" ");
                }
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void Y(){
        int i, j, k = 0;
        for(i = 1; i <= 10; i++){
            if(i < 8){
                for(j = 1; j < i; j++){
                    System.out.print(" ");
                }
                if(i < 7){
                    for(j = 1; j <= 3; j++){
                        System.out.print("*");
                    }
                    for(j = 1; j <= 13-(2*i); j++){
                        System.out.print(" ");
                    }
                }
                else{
                    for(j = 1; j < 3; j++){
                        System.out.print(" ");
                    }
                    for(j = 1; j <= 13-(2*i); j++){
                        System.out.print(" ");
                    }
                }
                
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
            }
            else{
                for(j = 1; j <= (i+i)-9-k; j++){ // 8-7 9-6 10-5
                    System.out.print(" ");
                }
                k += 3;
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void Z(){
        int i, j, k = 6;
        for(i = 1; i <= 10; i++){
            if(i < 3 || i > 8){
                for(j = 1; j <= 17; j++){
                    System.out.print("*");
                }
            }
            else { // (3-12 4-10 5-8 6-6 7-4 8-2) - (i+i) - k where k = 6 then k-=4
                for(j = 1; j <= (i+i)+k; j++){ 
                    System.out.print(" ");
                }
                k -= 4;
                for(j = 1; j <= 3; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter your Name (only Alphabet letter) - ");
        String name;

        Scanner in = new Scanner(System.in);

        name = in.next();

        char[] strArr = name.toCharArray();
        System.out.println();
        
        for(char i : strArr){
            switch (i) {

                case 'A':
                    A();
                    System.out.println();
                    break;

                case 'a':
                    A();
                    System.out.println();
                    break;

                case 'B':
                    B();
                    System.out.println();
                    break;

                case 'b':
                    B();
                    System.out.println();
                    break;

                case 'C':
                    C();
                    System.out.println();
                    break;

                case 'c':
                    C();
                    System.out.println();
                    break;

                case 'D':
                    D();
                    System.out.println();
                    break;

                case 'd':
                    D();
                    System.out.println();
                    break;

                case 'E':
                    E();
                    System.out.println();
                    break;

                case 'e':
                    E();
                    System.out.println();
                    break;

                case 'F':
                    F();
                    System.out.println();
                    break;

                case 'f':
                    F();
                    System.out.println();
                    break;

                case 'G':
                    G();
                    System.out.println();
                    break;

                case 'g':
                    G();
                    System.out.println();
                    break;

                case 'H':
                    H();
                    System.out.println();
                    break;

                case 'h':
                    H();
                    System.out.println();
                    break;

                case 'I':
                    I();
                    System.out.println();
                    break;

                case 'i':
                    I();
                    System.out.println();
                    break;

                case 'J':
                    J();
                    System.out.println();
                    break;

                case 'j':
                    J();
                    System.out.println();
                    break;

                case 'K':
                    K();
                    System.out.println();
                    break;

                case 'k':
                    K();
                    System.out.println();
                    break;

                case 'L':
                    L();
                    System.out.println();
                    break;

                case 'l':
                    L();
                    System.out.println();
                    break;

                case 'M':
                    M();
                    System.out.println();
                    break;

                case 'm':
                    M();
                    System.out.println();
                    break;

                case 'N':
                    N();
                    System.out.println();
                    break;

                case 'n':
                    N();
                    System.out.println();
                    break;

                case 'O':
                    O();
                    System.out.println();
                    break;

                case 'o':
                    O();
                    System.out.println();
                    break;

                case 'P':
                    P();
                    System.out.println();
                    break;

                case 'p':
                    P();
                    System.out.println();
                    break;

                case 'Q':
                    Q();
                    System.out.println();
                    break;

                case 'q':
                    Q();
                    System.out.println();
                    break;

                case 'R':
                    R();
                    System.out.println();
                    break;

                case 'r':
                    R();
                    System.out.println();
                    break;

                case 'S':
                    S();
                    System.out.println();
                    break;

                case 's':
                    S();
                    System.out.println();
                    break;

                case 'T':
                    T();
                    System.out.println();
                    break;

                case 't':
                    T();
                    System.out.println();
                    break;

                case 'U':
                    U();
                    System.out.println();
                    break;

                case 'u':
                    U();
                    System.out.println();
                    break;

                case 'V':
                    V();
                    System.out.println();
                    break;

                case 'v':
                    V();
                    System.out.println();
                    break;

                case 'W':
                    W();
                    System.out.println();
                    break;

                case 'w':
                    W();
                    System.out.println();
                    break;

                case 'X':
                    X();
                    System.out.println();
                    break;

                case 'x':
                    X();
                    System.out.println();
                    break;

                case 'Y':
                    Y();
                    System.out.println();
                    break;

                case 'y':
                    Y();
                    System.out.println();
                    break;

                case 'Z':
                    Z();
                    System.out.println();
                    break;

                case 'z':
                    Z();
                    System.out.println();
                    break;
                
                default:
                System.out.println("You enterd wrong character");
                    break;
            }
        }
        in.close();
    }
}