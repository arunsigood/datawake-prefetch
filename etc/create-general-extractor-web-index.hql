CREATE TABLE general_extractor_web_index(
    rowkey STRING,
    dt STRING
)
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
WITH SERDEPROPERTIES ('hbase.columns.mapping' = ':key,colFam:dt')
TBLPROPERTIES ('hbase.table.name' = 'general_extractor_web_index_hbase');