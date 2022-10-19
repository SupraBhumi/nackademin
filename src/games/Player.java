package games;

public class Player {

    private int score;
    private String name;

    //konstruktur
    /*
    public Player (String name, int score){
        this.name = name;
        this.score = score;
    }
    */

    //Använda Setters för att försvara ändringar i Player klass, och döpa name och score i main klass
    public void setPlayer(String name){
        this.name = name;

    }

    public void setScore(int score){
        this.score = score;
    }


    public int getScore(){
        return this.score;
    }

    //den ska visa i main klass (utifrån setPlayer raden)
    //@FIXME: by convention this method should be called toString with annotation @Override

/*
    public void displayPlayer(){
        System.out.println("Name : " + this.name + ", Score : " + this.score);
    }

 */

    public String getName(){

        return name;
    }

    //public void rageQiut(){System.exit(0);}

    //@FIXME: duplicate, choose one of them and delete the other

         @Override
        public String toString(){
            //return "Name: " + this.name + ", score" + this.score;
             System.out.println("Name : " + this.name + ", Score : " + this.score);
             return this.name;

    }


}



