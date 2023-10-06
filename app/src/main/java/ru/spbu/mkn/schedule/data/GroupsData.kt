package ru.spbu.mkn.schedule.data

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import ru.spbu.mkn.schedule.model.Group

object GroupsData {
    val gson = Gson()
    const val rowData =
        "[\"23.Б01-мкн М 1 курс\",\"23.Б02-мкн М 1 курс\",\"23.Б03-мкн М 1 курс\",\"23.Б05-мкн НоД 1 курс\",\"23.Б06-мкн НоД 1 курс\",\"23.Б09-мкн СП 1 курс\",\"23.Б10-мкн СП 1 курс\",\"22.Б01-мкн М 2 курс\",\"22.Б02-мкн М 2 курс\",\"22.Б03-мкн М 2 курс\",\"22.Б05-мкн НОД 2 курс\",\"22.Б06-мкн НОД 2 курс\",\"22.Б09-мкн СП 2 курс\",\"22.Б10-мкн СП 2 курс\",\"21.Б01-мкн М 3 курс\",\"21.Б02-мкн М 3 курс\",\"21.Б03-мкн М 3 курс\",\"21.Б05-мкн НОД 3 курс\",\"21.Б06-мкн НОД 3 курс\",\"21.Б09-мкн СП 3 курс\",\"21.Б10-мкн СП 3 курс\",\"20.Б01-мкн М 4 курс\",\"20.Б02-мкн М 4 курс\",\"20.Б03-мкн М 4 курс\",\"20.Б05-мкн МААД 4 курс\",\"20.Б06-мкн МААД 4 курс\",\"20.Б09-мкн СП 4 курс\",\"20.Б10-мкн СП 4 курс\",\"23.М01-мкн (1st year students)\",\"22.М01-мкн (2nd year students)\",\"23.М02-мкн (1st year students)\",\"22.М02-мкн (2nd year students)\",\"группа 23.А01-мкн (1st year PhD students)\",\"группа 22.А01-мкн (2nd year PhD students)\",\"группа 21.А01-мкн (3rd year PhD students)\"]"

    fun getGroupList(): List<Group> {
        val listType = object : TypeToken<ArrayList<String>>() {}.type
        val arrayList = gson.fromJson<List<String>>(rowData, listType)
        return arrayList.map { Group(it) }
    }
}

