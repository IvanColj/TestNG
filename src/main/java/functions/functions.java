package functions;

public class functions {

    public boolean privacy(int number) {
        return number % 2 == 0;
    }

    public int smallest(int number) {
        int divider = number;

        for (int i = 0; i < number; i++){
            if (i != 0 && i != 1 && number / i * i == number){
                    divider = i;
                    break;
            }
        }
        return divider;
    }

    public int root_number(int number){
        int root = 0;

        for (int i = 0; i <= number; i++){
            if (i * i == number) root = i;
        }
        return root;
    }
}
