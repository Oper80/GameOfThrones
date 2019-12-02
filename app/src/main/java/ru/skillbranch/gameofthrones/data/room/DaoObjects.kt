package ru.skillbranch.gameofthrones.data.room

import androidx.room.Dao
import androidx.room.Query

@Dao
interface DaoObjects {

    @Query("SELECT * FROM CharacterEntity WHERE id = :id")
    fun getCharById(id: Int): CharacterEntity

    @Query("SELECT * FROM CharacterEntity")
    fun getAllChars(): List<CharacterEntity>

    @Query("SELECT * FROM HouseEntity WHERE id = :id")
    fun getHouseById(id: Int): HouseEntity

    @Query("SELECT * FROM HouseEntity")
    fun getAllHouses(): List<HouseEntity>
}