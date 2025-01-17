# ChartDataResponseResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotationData** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) | All requested annotation data |  [optional]
**appliedFilters** | **List&lt;Object&gt;** | A list with applied filters |  [optional]
**cacheKey** | **String** | Unique cache key for query object | 
**cacheTimeout** | **Integer** | Cache timeout in following order: custom timeout, datasource timeout, default config timeout. | 
**cachedDttm** | **String** | Cache timestamp | 
**colnames** | **List&lt;String&gt;** | A list of column names |  [optional]
**coltypes** | **List&lt;Integer&gt;** | A list of generic data types of each column |  [optional]
**data** | **List&lt;Object&gt;** | A list with results |  [optional]
**error** | **String** | Error |  [optional]
**fromDttm** | **Integer** |  |  [optional]
**isCached** | **Boolean** | Is the result cached | 
**query** | **String** | The executed query statement | 
**rejectedFilters** | **List&lt;Object&gt;** | A list with rejected filters |  [optional]
**rowcount** | **Integer** | Amount of rows in result set |  [optional]
**stacktrace** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the query |  [optional]
**toDttm** | **Integer** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
STOPPED | &quot;stopped&quot;
FAILED | &quot;failed&quot;
PENDING | &quot;pending&quot;
RUNNING | &quot;running&quot;
SCHEDULED | &quot;scheduled&quot;
SUCCESS | &quot;success&quot;
TIMED_OUT | &quot;timed_out&quot;
