package uz.anorgroup.doonkdriver.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.anorgroup.doonkdriver.domain.usecase.location.CitysDialogUseCase
import uz.anorgroup.doonkdriver.domain.usecase.location.StreetssDialogUseCase
import uz.anorgroup.doonkdriver.domain.usecase.usecaseimpl.location.CitysDialogUseCaseImpl
import uz.anorgroup.doonkdriver.domain.usecase.usecaseimpl.location.StreetsDialogUseCaseImpl

@Module
@InstallIn(SingletonComponent::class)
interface LocationUseCaseModule {

    @Binds
    fun getStreets(impl: StreetsDialogUseCaseImpl): StreetssDialogUseCase

    @Binds
    fun getCitys(impl: CitysDialogUseCaseImpl): CitysDialogUseCase


}