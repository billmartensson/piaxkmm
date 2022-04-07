package se.magictechnology.piaxkmm

class Greeting {
    fun greeting(): String {
        return "Tjena, ${Platform().platform}!"
    }

}

class Person {
    var firstname = ""
    var lastname = ""
    var age = 0
    var isHappy = true

    fun getfullname() : String
    {
        return firstname + " " + lastname
    }


}

class FancyCounter {

    fun getnumber() : Int
    {
        return SparaSiffra().ladda()
    }

    fun letsadd() : Int
    {
        var thenumber = SparaSiffra().ladda()

        thenumber = thenumber + 1

        if(thenumber > 5)
        {
            thenumber = 0
        }

        SparaSiffra().spara(thenumber)

        return thenumber
    }

    fun othernumber(somecode : () -> Unit)
    {
        var thenumber = SparaSiffra().ladda()

        thenumber = thenumber + 2

        if(thenumber > 20)
        {
            thenumber = 0
        }

        SparaSiffra().spara(thenumber)

        somecode()
    }
}