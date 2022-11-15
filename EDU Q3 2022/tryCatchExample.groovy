class tryCatchExample{
    static void main(String[] args){
        try {
            def nbmr = new int[3]
            nbmr[1115] = 53
        } catch (Exception e){
            println(e.toString())
            println(e.getMessage())
            println(e.getStackTrace())
        } finally { //deprecated Java 9
            println "Koniec here"
        }
    }
}