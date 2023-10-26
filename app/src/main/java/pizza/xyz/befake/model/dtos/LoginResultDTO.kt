package pizza.xyz.befake.model.dtos

import com.google.gson.annotations.SerializedName

data class LoginResultDTO(
    @SerializedName("status") val status: Int,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: Data?,
) {

    data class Data(
        @SerializedName("otpSession") val otpSession: String,
    )
}