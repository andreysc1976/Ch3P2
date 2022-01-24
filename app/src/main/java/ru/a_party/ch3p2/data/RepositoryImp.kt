package ru.a_party.ch3p2.data

import ru.a_party.ch3p2.view.main.MainMVP

class RepositoryImp: MainMVP.Repository {
    private val localRepo = LocalRepositoryImpl()
    private val remoreRepo = RemoreRepositoryImpl()

    override fun getEnWord(ruWord: String): String {
        return localRepo.getEnWord(ruWord)?:remoreRepo.getEnWord(ruWord);
    }

    override fun getRuWord(enWord: String): String {
        return localRepo.getRuWord(enWord)?:remoreRepo.getRuWord(enWord);
    }
}