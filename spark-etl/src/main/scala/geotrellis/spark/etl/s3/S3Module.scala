package geotrellis.spark.etl.s3

import geotrellis.spark.etl.TypedModule

object S3Module extends TypedModule {
  register(new GeoTiffS3Input)
  register(new TemporalGeoTiffS3Input)
  register(new SpatialS3Output)
  register(new SpaceTimeS3Output)
  register(new MultibandGeoTiffS3Input)
  register(new TemporalMultibandGeoTiffS3Input)
  register(new SpaceTimeMultibandS3Output)
  register(new SpatialMultibandS3Output)
}
