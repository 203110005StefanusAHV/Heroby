package com.stefanus.app.data.mapper

import com.stefanus.app.data.api.model.Biography
import com.stefanus.app.data.db.entity.BiographyEntity
import javax.inject.Inject

class BiographyMapper @Inject constructor() {

  fun toEntity(data: Biography?) = BiographyEntity(
      alignment = data?.alignment,
      alterEgos = data?.alterEgos,
      firstAppearance = data?.firstAppearance,
      fullName = data?.fullName,
      placeOfBirth = data?.placeOfBirth,
      publisher = data?.publisher
  )

  fun toModel(data: BiographyEntity?) = Biography(
      alignment = data?.alignment,
      alterEgos = data?.alterEgos,
      firstAppearance = data?.firstAppearance,
      fullName = data?.fullName,
      placeOfBirth = data?.placeOfBirth,
      publisher = data?.publisher
  )
}