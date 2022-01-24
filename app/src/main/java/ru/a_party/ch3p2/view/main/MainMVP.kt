package ru.a_party.ch3p2.view.main

class MainMVP {
    interface View{

    }
    interface Presenter{
        fun onButtonChangeLanguagePressed()
    }

    interface Repository{
        fun getEnWord(ruWord:String):String?
        fun getRuWord(enWord:String):String?
    }
}