public enum Directions {

    NORTH("polnoc",0),
    EAST("wschod",1),
    SOUTH("poludnie",2),
    WEST("zachod",3),
    UNDEFINED("nieznany",-1);

    private final String PL_DIRECTION_NAME;
    private final int id;

    Directions(String PL_DIRECTION_NAME, int id) {
        this.PL_DIRECTION_NAME = PL_DIRECTION_NAME;
        this.id = id;
    }

    public static String getAll(){
        String result = "Dostepne kierunki: { ";
        Directions [] directions = Directions.values();
        for (Directions direction : directions) {
            if (direction.id>=0) {
                result += direction.PL_DIRECTION_NAME + ", ";
            }
        }
        return result+" } ";
    }

    public static Directions convert(int id){
        Directions result = UNDEFINED;
        Directions [] directions = Directions.values();
        for (Directions direction : directions) {
            if (direction.id == id){
                result = direction;
            }

        }
        return result;
    }


    public String getPL_DIRECTION_NAME() {
        return PL_DIRECTION_NAME;
    }

    public int getId() {
        return id;
    }
}
