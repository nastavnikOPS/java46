package lesson4;

public class Main4 {
    public static void main(String[] args){

        // Задача по объединению 2-х массивов

        char[] abcd = {'a' , 'b' , 'c' , 'd'};
        char[] qwer = {'q' , 'w', 'e', 'r'};

        char[] abcdqwer = new char[abcd.length + qwer.length];
        abcdqwer[0] = abcd[0]; // переложили a
        abcdqwer[1] = abcd[1]; // переложили b
        abcdqwer[2] = abcd[2]; // переложили c
        abcdqwer[3] = abcd[3]; // переложили d

        abcdqwer[4] = qwer[0]; // i - 4 = 0
        abcdqwer[5] = qwer[1]; // i - 4 = 1
        abcdqwer[6] = qwer[2]; // i - 4 = 2
        abcdqwer[7] = qwer[3]; // i - 4 = 3

        for(int i = 0; i < abcdqwer.length; i++){
            if(i < abcd.length){ // перекладываем с первого массива
                abcdqwer[i] = abcd[i];
            }else { // перекладываем со второго массива
                abcdqwer[i] = qwer[i - abcd.length];
            }
            System.out.println(abcdqwer[i]);
        }

    }
}
