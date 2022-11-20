package com.example.countrydetailsusingcleanarchitecture.data.model

data class CountryDetailsDTOItem(
    val altSpellings: List<String>?,
    val area: Double?,
    val borders: List<String>?,
    val capital: List<String>?,
    val capitalInfo: CapitalInfoXDTO?,
    val cca2: String?,
    val cca3: String?,
    val ccn3: String?,
    val cioc: String?,
    val coatOfArms: CoatOfArmsXDTO?,
    val continents: List<String>?,
    val fifa: String?,
    val flag: String?,
    val independent: Boolean?,
    val landlocked: Boolean?,
    val latlng: List<Double>?,
    val population: Int?,
    val region: String?,
    val startOfWeek: String?,
    val status: String?,
    val subregion: String?,
    val timezones: List<String>?,
    val tld: List<String>?,
    val unMember: Boolean?
)