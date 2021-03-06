package com.github.anant0070.kmm_network_request.repo

import com.github.anant0070.kmm_network_request.model.MovieDetails
import com.github.anant0070.kmm_network_request.model.MovieResponse

class ModelRepo {
    suspend fun getPopularMoviesData(pageNo: Int): MovieResponse {
        return getPopularMovies(pageNo)
    }

    suspend fun getMovieDetailData(id: Int): MovieDetails {
        return getMovieDetail(id)
    }
}
