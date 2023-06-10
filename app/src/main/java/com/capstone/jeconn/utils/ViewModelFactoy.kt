package com.capstone.jeconn.utils

import androidx.lifecycle.ViewModelProvider
import com.capstone.jeconn.repository.AuthRepository
import com.capstone.jeconn.repository.ProfileRepository
import com.capstone.jeconn.ui.screen.authentication.login_screen.LoginViewModel
import com.capstone.jeconn.ui.screen.authentication.register_screen.RegisterViewModel
import com.capstone.jeconn.ui.screen.authentication.required_info_screen.RequireInfoViewModel
import com.capstone.jeconn.ui.screen.authentication.required_location_screen.RequiredLocationViewModel
import com.capstone.jeconn.ui.screen.dashboard.profile_screen.ProfileViewModel
import com.capstone.jeconn.ui.screen.dashboard.profile_screen.edit_detail_info.EditDetailInfoViewModel
import com.capstone.jeconn.ui.screen.dashboard.profile_screen.myprofile.MyProfileViewModel

class AuthViewModelFactory(private val repository: AuthRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : androidx.lifecycle.ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(RegisterViewModel::class.java)) {
            return RegisterViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(RequireInfoViewModel::class.java)) {
            return RequireInfoViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(RequiredLocationViewModel::class.java)) {
            return RequiredLocationViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}

class ProfileViewModelFactory(private val repository: ProfileRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : androidx.lifecycle.ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfileViewModel::class.java)) {
            return ProfileViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(MyProfileViewModel::class.java)) {
            return MyProfileViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(EditDetailInfoViewModel::class.java)) {
            return EditDetailInfoViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}