package com.AdrianoDev.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
data class Question(
    val id: Int,
    val perguntas: String,
    val respostas: Map<String, String>,
    val respostaCorreta: String,
    val respostaValor: String,
    val tamanhoPerguntaParte1:Float,
    val tamanhoPerguntaParte2:Float,
    val tamanhoPerguntaParte3:Boolean,
    val space:Float,
    val fontSize:Float
)
fun Application.configureRouting() {
    routing {
        get("/") {

            val perguntas = listOf(
                Question(
                    1,
                    "Qual equipe que mais pontuou nas primeiras quinze rodadas do Brasileirão?",
                    mapOf(
                        "A" to "Flamengo",
                        "B" to "Palmeiras",
                        "C" to "Botafogo",
                        "D" to "Corinthians"
                    ),
                    "C", "Botafogo", 2.6f, 2.1f, true, 12.0f, 12.0f
                ),

                Question(
                    2,
                    "Na era dos pontos corridos, qual equipe detém o maior número de títulos do Brasileirão?",
                    mapOf(
                        "A" to "Corinthians",
                        "B" to "Palmeiras",
                        "C" to "Flamengo",
                        "D" to "São Paulo"
                    ),
                    "A", "Corinthians", 3.05f, 1.96f, true, 12.0f, 12.9f
                ),

                Question(
                    3,
                    "Qual time detem o recorde de mais vitórias consecutivas em uma única edição do Brasileirão?",
                    mapOf(
                        "A" to "Atletico-MG",
                        "B" to "Santos",
                        "C" to "Guarani",
                        "D" to "Internacional"
                    ),
                    "C", "Guarani", 3.07f, 2.0f, true, 12.0f, 12.7f
                ),

                Question(
                    4,
                    "A edição do Brasileirão em que um artilheiro marcou o maior número de gols na historia?",
                    mapOf(
                        "A" to "1977",
                        "B" to "2004",
                        "C" to "1973",
                        "D" to "2000"
                    ),
                    "B", "2004", 2.85f, 2.0f, true, 12.0f, 12.7f
                ),

                Question(
                    5,
                    "Qual equipe teve em seu elenco mais vezes o artilheiro do Campeonato Brasileiro?",
                    mapOf(
                        "A" to "Fluminense",
                        "B" to "Santos",
                        "C" to "Vasco",
                        "D" to "Flamengo"
                    ),
                    "C", "Vasco", 2.6f, 1.9f, true, 12.0f, 12.7f
                ),


                Question(
                    6,
                    "Com quantos pontos terminou o lider do Brasileirão de 2008?",
                    mapOf(
                        "A" to "69 pontos",
                        "B" to "77 pontos",
                        "C" to "67 pontos",
                        "D" to "75 pontos"
                    ),
                    "D", "75 pontos", 2.0f, 1.85f, true, 12.0f, 12.7f
                ),

                Question(
                    7,
                    "Qual foi a equipe que ganhou o campeonato brasileiro de  1988?",
                    mapOf(
                        "A" to "Bahia",
                        "B" to "Vasco",
                        "C" to "Flamengo",
                        "D" to "Fluminense"
                    ),
                    "A", "Bahia", 2.85f, 2.0f, true, 12.0f, 12.7f
                ),

                Question(
                    8,
                    "Qual a equipe que tem a melhor campanha na era dos pontos corridos com 20 times?",
                    mapOf(
                        "A" to "Cruzeiro",
                        "B" to "Internacional",
                        "C" to "Gremio",
                        "D" to "Flamengo"
                    ),
                    "D", "Flamengo", 2.65f, 1.9f, true, 12.0f, 12.7f
                ),

                Question(
                    9,
                    "Qual foi a equipe ficou mais vezes no G4 do Brasileirão?",
                    mapOf(
                        "A" to "Palmeiras",
                        "B" to "Internacional",
                        "C" to "Gremio",
                        "D" to "Cruzeiro"
                    ),
                    "A", "Palmeiras", 1.95f, 2f, false, 10.0f, 12.0f
                ),

                Question(
                    10,
                    "Qual foi a equipe que fez a maior goleada da historia do Brasileirão?",
                    mapOf(
                        "A" to "Flamengo",
                        "B" to "Corinthians",
                        "C" to "Gremio",
                        "D" to "Cruzeiro"
                    ),
                    "B", "Corinthians", 2.4f, 1.95f, true, 12.0f, 12.0f
                ),


                Question(
                    11,
                    "Qual foi a equipe que ganhou o campeonato brasileiro de  1978?",
                    mapOf(
                        "A" to "Bahia",
                        "B" to "Internacional",
                        "C" to "Cruzeiro",
                        "D" to "Guarani"
                    ),
                    "D", "Guarani", 2.15f, 2.0f, true, 12.0f, 12.0f
                ),

                Question(
                    12,
                    "Qual foi a equipe que ganhou o campeonato brasileiro de 1964 (Brasileirão unificado)",
                    mapOf(
                        "A" to "Cruzeiro",
                        "B" to "Palmeiras",
                        "C" to "Santos",
                        "D" to "Botafogo"
                    ),
                    "C", "Santos", 3.0f, 2.0f, true, 12.0f, 12.7f
                ),


                Question(
                    13,
                    "Qual dessas equipes é a unica a ganhar o Brasileirão de forma invicta?",
                    mapOf(
                        "A" to "Internacional",
                        "B" to "Flamengo",
                        "C" to "Corinthians",
                        "D" to "São Paulo"
                    ),
                    "A", "Internacional", 2.9f, 2.2f, true, 12.0f, 12.7f
                ),

                Question(
                    14,
                    "Qual dessas equipes é a unica a ganhar o Brasileirão por tres vezes consecutivas?",
                    mapOf(
                        "A" to "São Paulo",
                        "B" to "Flamengo",
                        "C" to "Palmeiras",
                        "D" to "Corinthians"
                    ),
                    "A", "São Paulo", 2.65f, 1.9f, true, 12.0f, 12.7f
                ),

                Question(
                    15,
                    "Qual a equipe com a maior sequencia invicta da historia do Brasileirão?",
                    mapOf(
                        "A" to "Cruzeiro",
                        "B" to "Internacional",
                        "C" to "Gremio",
                        "D" to "Flamengo"
                    ),
                    "D", "Flamengo", 2.65f, 2.15f, true, 12.0f, 12.7f
                ),

                Question(
                    16,
                    "Qual equipe fez a melhor campanha de vice-campeão na era dos pontos corridos do Brasileirão?",
                    mapOf(
                        "A" to "Santos",
                        "B" to "Flamengo",
                        "C" to "Gremio",
                        "D" to "Cruzeiro"
                    ),
                    "A", "Santos", 2.7f, 1.8f, true, 12.0f, 14.0f
                ),

                Question(
                    17,
                    "Qual foi ano em que o Gremio conquistou o seu primeiro Brasileirão?",
                    mapOf(
                        "A" to "1983",
                        "B" to "1881",
                        "C" to "1996",
                        "D" to "1980"
                    ),
                    "A", "1983", 2.95f, 1.95f, true, 12.0f, 12.0f
                ),

                Question(
                    18,
                    "Qual foi a equipe que ganhou o campeonato brasileiro de  1979?",
                    mapOf(
                        "A" to "Flamengo",
                        "B" to "Gremio",
                        "C" to "São Paulo",
                        "D" to "Internacional"
                    ),
                    "D", "Internacional", 2.15f, 2.0f, true, 12.0f, 12.0f
                ),

                Question(
                    19,
                    "Em qual desses anos o Fluminense conquistou um dos seus titulos do Brasileirão?",
                    mapOf(
                        "A" to "1977",
                        "B" to "2009",
                        "C" to "2013",
                        "D" to "2012"
                    ),
                    "D", "2012", 3.5f, 2.15f, true, 12.0f, 12.7f
                ),

                Question(
                    20,
                    "Em qual desses anos o Atletico-Mg conquistou um dos seus titulos do Brasileirão?",
                    mapOf(
                        "A" to "1972",
                        "B" to "2004",
                        "C" to "1971",
                        "D" to "1995"
                    ),
                    "C", "1971", 3.5f, 2.2f, true, 12.0f, 12.7f
                ),

                Question(
                    21,
                    "Qual foi a edição mais disputada da era dos pontos corridos do Brasileião?",
                    mapOf(
                        "A" to "2004",
                        "B" to "2008",
                        "C" to "2005",
                        "D" to "2009"
                    ),
                    "A", "2004", 3.1f, 2.2f, true, 12.0f, 12.7f
                ),

                Question(
                    22,
                    "Desde 1959 qual dessas equipes foi a que mais participou do Brasileirão?",
                    mapOf(
                        "A" to "Gremio",
                        "B" to "Atletico-Mg",
                        "C" to "Cruzeiro",
                        "D" to "Santos"
                    ),
                    "A", "Gremio", 3.1f, 2.0f, true, 12.0f, 12.7f
                ),

                Question(
                    23,
                    "Em toda a sua historia, qual dos times nordestinos foi o que mais participou do Brasileirão?",
                    mapOf(
                        "A" to "Sport",
                        "B" to "Fortaleza",
                        "C" to "Vitoria",
                        "D" to "Bahia"
                    ),
                    "D", "Bahia", 3.2f, 2.2f, true, 12.0f, 12.7f
                ),

                Question(
                    24,
                    "Até os dias de hoje quantos times ganharam o Brasileirão em toda sua hitoria?",
                    mapOf(
                        "A" to "17 times",
                        "B" to "9 times",
                        "C" to "12 times",
                        "D" to "14 times"
                    ),
                    "A", "17 times", 2.85f, 2.1f, true, 12.0f, 12.7f
                ),

                Question(
                    25,
                    "Em qual ano o Flamengo ganhou o seu primeiro campeonato brasileiro?",
                    mapOf(
                        "A" to "1959",
                        "B" to "1995",
                        "C" to "1981",
                        "D" to "1980"
                    ),
                    "D", "1980", 2.8f, 1.95f, true, 12.0f, 12f
                ),


                Question(
                    26,
                    "Em qual ano o campeonato brasileiro teve mais participantes em sua historia?",
                    mapOf(
                        "A" to "2003",
                        "B" to "1979",
                        "C" to "2000",
                        "D" to "2022"
                    ),
                    "C", "2000", 3.0f, 2.4f, true, 12.0f, 12.7f
                ),

                Question(
                    27,
                    "Em qual ano o campeonato brasileiro teve 11 partidas canceladas?",
                    mapOf(
                        "A" to "1975",
                        "B" to "2005",
                        "C" to "2020",
                        "D" to "1969"
                    ),
                    "B", "2005", 2.6f, 2.2f, true, 12.0f, 12.0f
                ),

                Question(
                    28,
                    "Qual equipe terminou mais vezes a rodada do Brasileirão dos pontos corridos na liderança?",
                    mapOf(
                        "A" to "Palmeiras",
                        "B" to "Corinthians",
                        "C" to "São Paulo",
                        "D" to "Internacional"
                    ),
                    "B", "Corinthians", 2.7f, 1.85f, true, 12.0f, 12.7f
                ),

                Question(
                    29,
                    "Com quantos pontos terminou o lider do Brasileirão de 2007?",
                    mapOf(
                        "A" to "77 pontos",
                        "B" to "75 pontos",
                        "C" to "81 pontos",
                        "D" to "75 pontos"
                    ),
                    "A", "77 pontos", 2.0f, 1.85f, true, 12.0f, 12.7f
                ),

                Question(
                    30,
                    "Qual equipe conquistou o Brasileirão com o menor número de derrotas?",
                    mapOf(
                        "A" to "São Paulo",
                        "B" to "Flamengo",
                        "C" to "Palmeiras",
                        "D" to "Corinthians"
                    ),
                    "C", "Palmeiras", 2.7f, 1.95f, true, 12.0f, 12.2f
                ),

                Question(
                    31,
                    "Qual a equipe que mais marcou gols em toda a historia do Brasileirão?",
                    mapOf(
                        "A" to "Santos",
                        "B" to "São Paulo",
                        "C" to "Corinthians",
                        "D" to "Cruzeiro"
                    ),
                    "A", "Santos", 2.9f, 1.95f, true, 12.0f, 12.7f
                ),

                Question(
                    32,
                    "Qual a equipe que mais pontuou em toda a historia do Brasileirão na era pontos corridos?",
                    mapOf(
                        "A" to "Flamengo",
                        "B" to "São Paulo",
                        "C" to "Corinthians",
                        "D" to "Palmeiras"
                    ),
                    "B", "São Paulo", 2.8f, 2.1f, true, 12.0f, 12.7f
                ),

                Question(
                    33,
                    "Qual a equipe com mais derrotas em toda a historia do Brasileirão na era pontos corridos",
                    mapOf(
                        "A" to "Fluminense",
                        "B" to "Atletico-Mg",
                        "C" to "Atletico-Pr",
                        "D" to "Santos"
                    ),
                    "C", "Atletico-Pr", 2.7f, 2.05f, true, 12.0f, 12.7f
                ),

                Question(
                    35,
                    "Qual a equipe que mais recebeu cartão amarelo em toda a historia do Brasileirão na era pontos corridos?",
                    mapOf(
                        "A" to "São Paulo",
                        "B" to "Corinthians",
                        "C" to "Gremio",
                        "D" to "Internacional"
                    ),
                    "A", "São Paulo", 2.65f, 1.8f, true, 12.0f, 16.7f
                ),

                Question(
                    36,
                    "Qual a equipe que mais recebeu cartão vermelho em toda a historia do Brasileirão na era pontos corridos",
                    mapOf(
                        "A" to "Flamengo",
                        "B" to "Corinthians",
                        "C" to "São Paulo",
                        "D" to "Internacional"
                    ),
                    "C", "São Paulo", 2.65f, 1.8f, true, 12.0f, 16.7f
                ),

                Question(
                    37,
                    "Qual o ano que ficou marcado com o aumento do numero de vagas para libertadres no Brasileirão?",
                    mapOf(
                        "A" to "2018",
                        "B" to "2016",
                        "C" to "2003",
                        "D" to "2019"
                    ),
                    "B", "2016", 2.85f, 1.95f, true, 12.0f, 14.7f
                ),

                /////////////////////////////////////////////
                ///////////////////////////////////////////

                Question(
                    38,
                    "Em qual ano os herois da Chapecoense se classificaram para a libertadores pelo Brasileirão?",
                    mapOf(
                        "A" to "2017",
                        "B" to "2016",
                        "C" to "2018",
                        "D" to "2015"
                    ),
                    "A", "2017", 3.6f, 2.15f, true, 12.0f, 14.7f
                ),

                Question(
                    39,
                    "Qual equipe terminou o Brasileirão de 2015 em sexto lugar e com 59  pontos?",
                    mapOf(
                        "A" to "Santos",
                        "B" to "Internacional",
                        "C" to "Sport",
                        "D" to "São Paulo"
                    ),
                    "C", "Sport", 2.15f, 2.0f, true, 12.0f, 14.0f
                ),

                Question(
                    40,
                    "Qual foi a equipe que ganhou o campeonato brasileiro de  1977?",
                    mapOf(
                        "A" to "Fluminense",
                        "B" to "Palmeiras",
                        "C" to "São Paulo",
                        "D" to "Internacional"
                    ),
                    "C", "São Paulo", 2.15f, 2.0f, true, 12.0f, 12.0f
                ),

//        Question(
//            "Qual foi a equipe que ganhou o campeonato brasileiro de  1999?",
//            mapOf(
//                "A" to "Gremio",
//                "B" to "Corinthians",
//                "C" to "Vasco",
//                "D" to "Palmeiras"
//            ),
//            "B","Corinthians",2.15f,2.0f,true,12.0f,12.0f
//        ),
//
//        Question(
//            "Qual foi a equipe que ganhou o campeonato brasileiro de  1989?",
//            mapOf(
//                "A" to "Gremio",
//                "B" to "Corinthians",
//                "C" to "Vasco",
//                "D" to "Palmeiras"
//            ),
//            "C","Vasco",2.15f,2.0f,true,12.0f,12.0f
//        ),
//
//        Question(
//            "Qual foi a equipe que ganhou o campeonato brasileiro de  1984?",
//            mapOf(
//                "A" to "Guarani",
//                "B" to "Fluminense",
//                "C" to "Flamengo",
//                "D" to "Coritiba"
//            ),
//            "D","Coritiba",2.15f,2.0f,true,12.0f,12.0f
//        ),


            )

            call.respondText(perguntas.toString())
        }
    }
}
