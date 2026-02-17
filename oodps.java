class OOPSBanner {

    public static void main(String[] args) {

        System.out.println("OOPS Banner Output:\n");

        String[][] letters = {

                // Row 1
                {
                        " ***** ",  // O
                        " ***** ",  // O
                        " ***** ",  // P
                        " ***** "   // S
                },

                // Row 2
                {
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "
                },

                // Row 3
                {
                        "*     *",
                        "*     *",
                        " ***** ",
                        " ***** "
                },

                // Row 4
                {
                        "*     *",
                        "*     *",
                        "*      ",
                        "      *"
                },

                // Row 5
                {
                        " ***** ",
                        " ***** ",
                        "*      ",
                        " ***** "
                }

        };

        // Enhanced for loop to print each row
        for (String[] row : letters) {
            System.out.println(String.join("   ", row));
        }
    }
}