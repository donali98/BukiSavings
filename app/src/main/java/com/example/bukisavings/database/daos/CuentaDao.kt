package com.example.bukisavings.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.bukisavings.database.entities.Cuenta

@Dao
interface CuentaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserCuenta(cuenta: Cuenta)
}