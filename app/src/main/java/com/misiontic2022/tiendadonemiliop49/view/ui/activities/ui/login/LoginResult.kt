package com.misiontic2022.tiendadonemiliop49.view.ui.activities.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult (
     val success:LoggedInUserView? = null,
     val error:Int? = null
)