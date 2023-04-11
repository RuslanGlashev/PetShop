package di

import data.DataSource
import data.DataSourceImpl
import data.RepositoryImpl
import domain.Repository
import domain.UseCase
import domain.UseCaseImpl

object DI {
    fun injectDataSource(): DataSource = DataSourceImpl()
    fun injectRepository(): Repository = RepositoryImpl(dataSource = injectDataSource())
    fun injectUseCase(): UseCase = UseCaseImpl(repository = injectRepository())
}