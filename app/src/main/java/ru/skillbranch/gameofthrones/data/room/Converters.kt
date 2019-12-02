package ru.skillbranch.gameofthrones.data.room

import androidx.room.TypeConverter

class Converters {
    @TypeConverter
    fun fromString(value: String): List<String> = value.split(";")

    @TypeConverter
    fun fromArrayList(list: List<String>) = list.joinToString(";")
}