package com.misiontic2022.tiendadonemiliop49.view.ui.activities.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String
)