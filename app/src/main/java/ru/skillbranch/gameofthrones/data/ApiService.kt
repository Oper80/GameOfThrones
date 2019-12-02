package ru.skillbranch.gameofthrones.data

import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import ru.skillbranch.gameofthrones.AppConfig
import ru.skillbranch.gameofthrones.data.remote.res.CharacterRes

interface ApiService {
    @GET("api/characters")
    suspend fun getCharacters(): Response<List<CharacterRes>>
}

object RetrofitFactory {
    fun makeRetrofitService(): ApiService {
        return Retrofit.Builder()
            .baseUrl(AppConfig.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build().create(ApiService::class.java)
    }
}