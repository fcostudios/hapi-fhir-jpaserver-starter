package ca.uhn.fhir.jpa.starter;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.api.config.JpaStorageSettings;
import ca.uhn.fhir.jpa.api.config.JpaStorageSettings.ClientIdStrategyEnum;
import ca.uhn.fhir.jpa.api.config.JpaStorageSettings.IdStrategyEnum;
import ca.uhn.fhir.jpa.model.entity.NormalizedQuantitySearchLevel;
import ca.uhn.fhir.jpa.packages.PackageInstallationSpec;
import ca.uhn.fhir.rest.api.EncodingEnum;
import org.hl7.fhir.r4.model.Bundle;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ConfigurationProperties(prefix = "hapi.fhir")
@Configuration
@EnableConfigurationProperties
public class AppProperties {

	private final Set<String> auto_version_reference_at_paths = new HashSet<>();
	private final Set<String> local_base_urls = new HashSet<>();
	private final Set<String> logical_urls = new HashSet<>();
	private final List<String> custom_interceptor_classes = new ArrayList<>();
	private final List<String> custom_provider_classes = new ArrayList<>();
	private Boolean cr_enabled = false;
	private Boolean ips_enabled = false;
	private Boolean openapi_enabled = false;
	private Boolean mdm_enabled = false;
	private String mdm_rules_json_location = "mdm-rules.json";
	private boolean advanced_lucene_indexing = false;
	private boolean search_index_full_text_enabled = false;
	private boolean enable_index_of_type = false;
	private Boolean allow_cascading_deletes = false;
	private Boolean allow_contains_searches = true;
	private Boolean allow_external_references = false;
	private Boolean allow_multiple_delete = false;
	private Boolean allow_override_default_search_params = true;
	private Boolean auto_create_placeholder_reference_targets = false;
	private Boolean mass_ingestion_mode_enabled = false;
	private Boolean language_search_parameter_enabled = false;
	private Boolean dao_scheduling_enabled = true;
	private Boolean delete_expunge_enabled = false;
	private Boolean enable_index_missing_fields = false;
	private Boolean enable_index_contained_resource = false;
	private Boolean enable_repository_validating_interceptor = false;
	private Boolean enforce_referential_integrity_on_delete = true;
	private Boolean enforce_referential_integrity_on_write = true;
	private Boolean etag_support_enabled = true;
	private Boolean expunge_enabled = true;
	private Boolean fhirpath_interceptor_enabled = false;
	private Boolean filter_search_enabled = true;
	private Boolean graphql_enabled = false;
	private Boolean binary_storage_enabled = false;
	private Integer inline_resource_storage_below_size = 0;
	private Boolean bulk_export_enabled = false;
	private Boolean bulk_import_enabled = false;
	private Boolean default_pretty_print = true;
	private Integer default_page_size = 20;
	private Integer max_binary_size = null;
	private Integer max_page_size = Integer.MAX_VALUE;
	private Integer defer_indexing_for_codesystems_of_size = 100;
	private Long retain_cached_searches_mins = 60L;
	private Long reuse_cached_search_results_millis = 60000L;
	private String server_address = null;
	private EncodingEnum default_encoding = EncodingEnum.JSON;
	private FhirVersionEnum fhir_version = FhirVersionEnum.R4;
	private ClientIdStrategyEnum client_id_strategy = ClientIdStrategyEnum.ALPHANUMERIC;
	private IdStrategyEnum server_id_strategy = null;
	private List<String> supported_resource_types = new ArrayList<>();
	private List<Bundle.BundleType> allowed_bundle_types = null;
	private Boolean narrative_enabled = true;
	private Boolean ig_runtime_upload_enabled = false;
	private Validation validation = new Validation();
	private Map<String, Tester> tester = null;
	private Logger logger = new Logger();
	private Subscription subscription = new Subscription();
	private Cors cors = null;
	private Partitioning partitioning = null;
	private Boolean validate_resource_status_for_package_upload = true;
	private Boolean install_transitive_ig_dependencies = true;
	private Map<String, PackageInstallationSpec> implementationGuides = null;
	private String custom_content_path = null;
	private String app_content_path = null;
	private Boolean lastn_enabled = false;
	private boolean store_resource_in_lucene_index_enabled = false;
	private NormalizedQuantitySearchLevel normalized_quantity_search_level =
			NormalizedQuantitySearchLevel.NORMALIZED_QUANTITY_SEARCH_NOT_SUPPORTED;
	private Boolean use_apache_address_strategy = false;
	private Boolean use_apache_address_strategy_https = false;
	private Integer bundle_batch_pool_size = 20;
	private Integer bundle_batch_pool_max_size = 100;
	private Boolean resource_dbhistory_enabled = true;
	private Boolean upliftedRefchains_enabled = false;

	private boolean userRequestRetryVersionConflictsInterceptorEnabled = false;

	private List<Integer> search_prefetch_thresholds = new ArrayList<>();
	private Boolean pre_expand_value_sets = true;
	private Boolean enable_task_pre_expand_value_sets = true;
	private Integer pre_expand_value_sets_default_count = 1000;
	private Integer pre_expand_value_sets_max_count = 1000;
	private Integer maximum_expansion_size = 1000;
	private JpaStorageSettings.StoreMetaSourceInformationEnum store_meta_source_information =
			JpaStorageSettings.StoreMetaSourceInformationEnum.NONE;

	private Map<String, RemoteSystem> remote_terminology_service = null;

	public List<String> getCustomInterceptorClasses() {
		return custom_interceptor_classes;
	}

	public List<String> getCustomProviderClasses() {
		return custom_provider_classes;
	}

	public Boolean getOpenapi_enabled() {
		return openapi_enabled;
	}

	public void setOpenapi_enabled(Boolean openapi_enabled) {
		this.openapi_enabled = openapi_enabled;
	}

	public Boolean getUse_apache_address_strategy() {
		return use_apache_address_strategy;
	}

	public void setUse_apache_address_strategy(Boolean use_apache_address_strategy) {
		this.use_apache_address_strategy = use_apache_address_strategy;
	}

	public Boolean getUse_apache_address_strategy_https() {
		return use_apache_address_strategy_https;
	}

	public void setUse_apache_address_strategy_https(Boolean use_apache_address_strategy_https) {
		this.use_apache_address_strategy_https = use_apache_address_strategy_https;
	}

	public Integer getDefer_indexing_for_codesystems_of_size() {
		return defer_indexing_for_codesystems_of_size;
	}

	public void setDefer_indexing_for_codesystems_of_size(Integer defer_indexing_for_codesystems_of_size) {
		this.defer_indexing_for_codesystems_of_size = defer_indexing_for_codesystems_of_size;
	}

	public Map<String, PackageInstallationSpec> getImplementationGuides() {
		return implementationGuides;
	}

	public void setImplementationGuides(Map<String, PackageInstallationSpec> implementationGuides) {
		this.implementationGuides = implementationGuides;
	}

	public Partitioning getPartitioning() {
		return partitioning;
	}

	public void setPartitioning(Partitioning partitioning) {
		this.partitioning = partitioning;
	}

	public Boolean getCr_enabled() {
		return cr_enabled;
	}

	public void setCr_enabled(Boolean cr_enabled) {
		this.cr_enabled = cr_enabled;
	}

	public Boolean getIps_enabled() {
		return ips_enabled;
	}

	public void setIps_enabled(Boolean ips_enabled) {
		this.ips_enabled = ips_enabled;
	}

	public Boolean getMdm_enabled() {
		return mdm_enabled;
	}

	public void setMdm_enabled(Boolean mdm_enabled) {
		this.mdm_enabled = mdm_enabled;
	}

	public String getMdm_rules_json_location() {
		return mdm_rules_json_location;
	}

	public void setMdm_rules_json_location(String mdm_rules_json_location) {
		this.mdm_rules_json_location = mdm_rules_json_location;
	}

	public Cors getCors() {
		return cors;
	}

	public void setCors(Cors cors) {
		this.cors = cors;
	}

	public List<Bundle.BundleType> getAllowed_bundle_types() {
		return allowed_bundle_types;
	}

	public void setAllowed_bundle_types(List<Bundle.BundleType> allowed_bundle_types) {
		this.allowed_bundle_types = allowed_bundle_types;
	}

	public String getServer_address() {
		return server_address;
	}

	public void setServer_address(String server_address) {
		this.server_address = server_address;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Boolean getDefault_pretty_print() {
		return default_pretty_print;
	}

	public void setDefault_pretty_print(Boolean default_pretty_print) {
		this.default_pretty_print = default_pretty_print;
	}

	public Validation getValidation() {
		return validation;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}

	public List<String> getSupported_resource_types() {
		return supported_resource_types;
	}

	public void setSupported_resource_types(List<String> supported_resource_types) {
		this.supported_resource_types = supported_resource_types;
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public ClientIdStrategyEnum getClient_id_strategy() {
		return client_id_strategy;
	}

	public void setClient_id_strategy(ClientIdStrategyEnum client_id_strategy) {
		this.client_id_strategy = client_id_strategy;
	}

	public IdStrategyEnum getServer_id_strategy() {
		return server_id_strategy;
	}

	public void setServer_id_strategy(IdStrategyEnum server_id_strategy) {
		this.server_id_strategy = server_id_strategy;
	}

	public boolean getAdvanced_lucene_indexing() {
		return this.advanced_lucene_indexing;
	}

	public void setAdvanced_lucene_indexing(boolean theAdvanced_lucene_indexing) {
		advanced_lucene_indexing = theAdvanced_lucene_indexing;
	}

	public boolean getSearch_index_full_text_enabled() {
		return this.search_index_full_text_enabled;
	}

	public void setSearch_index_full_text_enabled(boolean theSearch_index_full_text_enabled) {
		search_index_full_text_enabled = theSearch_index_full_text_enabled;
	}

	public Boolean getAllow_cascading_deletes() {
		return allow_cascading_deletes;
	}

	public void setAllow_cascading_deletes(Boolean allow_cascading_deletes) {
		this.allow_cascading_deletes = allow_cascading_deletes;
	}

	public Boolean getAllow_contains_searches() {
		return allow_contains_searches;
	}

	public void setAllow_contains_searches(Boolean allow_contains_searches) {
		this.allow_contains_searches = allow_contains_searches;
	}

	public Boolean getAllow_external_references() {
		return allow_external_references;
	}

	public void setAllow_external_references(Boolean allow_external_references) {
		this.allow_external_references = allow_external_references;
	}

	public Boolean getAllow_multiple_delete() {
		return allow_multiple_delete;
	}

	public void setAllow_multiple_delete(Boolean allow_multiple_delete) {
		this.allow_multiple_delete = allow_multiple_delete;
	}

	public Boolean getAllow_override_default_search_params() {
		return allow_override_default_search_params;
	}

	public void setAllow_override_default_search_params(Boolean allow_override_default_search_params) {
		this.allow_override_default_search_params = allow_override_default_search_params;
	}

	public Boolean getMass_ingestion_mode_enabled() {
		return mass_ingestion_mode_enabled;
	}

	public void setMass_ingestion_mode_enabled(Boolean mass_ingestion_mode_enabled) {
		this.mass_ingestion_mode_enabled = mass_ingestion_mode_enabled;
	}

	public Boolean getAuto_create_placeholder_reference_targets() {
		return auto_create_placeholder_reference_targets;
	}

	public void setAuto_create_placeholder_reference_targets(Boolean auto_create_placeholder_reference_targets) {
		this.auto_create_placeholder_reference_targets = auto_create_placeholder_reference_targets;
	}

	public Set<String> getAuto_version_reference_at_paths() {
		return auto_version_reference_at_paths;
	}

	public Integer getDefault_page_size() {
		return default_page_size;
	}

	public void setDefault_page_size(Integer default_page_size) {
		this.default_page_size = default_page_size;
	}

	public Boolean getDao_scheduling_enabled() {
		return dao_scheduling_enabled;
	}

	public void setDao_scheduling_enabled(Boolean dao_scheduling_enabled) {
		this.dao_scheduling_enabled = dao_scheduling_enabled;
	}

	public Boolean getDelete_expunge_enabled() {
		return delete_expunge_enabled;
	}

	public void setDelete_expunge_enabled(Boolean delete_expunge_enabled) {
		this.delete_expunge_enabled = delete_expunge_enabled;
	}

	public Boolean getEnable_index_missing_fields() {
		return enable_index_missing_fields;
	}

	public void setEnable_index_missing_fields(Boolean enable_index_missing_fields) {
		this.enable_index_missing_fields = enable_index_missing_fields;
	}

	public Boolean getEnable_index_contained_resource() {
		return enable_index_contained_resource;
	}

	public void setEnable_index_contained_resource(Boolean enable_index_contained_resource) {
		this.enable_index_contained_resource = enable_index_contained_resource;
	}

	public Boolean getEnable_repository_validating_interceptor() {
		return enable_repository_validating_interceptor;
	}

	public void setEnable_repository_validating_interceptor(Boolean theEnable_repository_validating_interceptor) {
		enable_repository_validating_interceptor = theEnable_repository_validating_interceptor;
	}

	public Boolean getEnforce_referential_integrity_on_delete() {
		return enforce_referential_integrity_on_delete;
	}

	public void setEnforce_referential_integrity_on_delete(Boolean enforce_referential_integrity_on_delete) {
		this.enforce_referential_integrity_on_delete = enforce_referential_integrity_on_delete;
	}

	public Boolean getEnforce_referential_integrity_on_write() {
		return enforce_referential_integrity_on_write;
	}

	public void setEnforce_referential_integrity_on_write(Boolean enforce_referential_integrity_on_write) {
		this.enforce_referential_integrity_on_write = enforce_referential_integrity_on_write;
	}

	public Boolean getEtag_support_enabled() {
		return etag_support_enabled;
	}

	public void setEtag_support_enabled(Boolean etag_support_enabled) {
		this.etag_support_enabled = etag_support_enabled;
	}

	public Boolean getExpunge_enabled() {
		return expunge_enabled;
	}

	public void setExpunge_enabled(Boolean expunge_enabled) {
		this.expunge_enabled = expunge_enabled;
	}

	public Boolean getFhirpath_interceptor_enabled() {
		return fhirpath_interceptor_enabled;
	}

	public void setFhirpath_interceptor_enabled(Boolean fhirpath_interceptor_enabled) {
		this.fhirpath_interceptor_enabled = fhirpath_interceptor_enabled;
	}

	public Boolean getFilter_search_enabled() {
		return filter_search_enabled;
	}

	public void setFilter_search_enabled(Boolean filter_search_enabled) {
		this.filter_search_enabled = filter_search_enabled;
	}

	public Boolean getGraphql_enabled() {
		return graphql_enabled;
	}

	public void setGraphql_enabled(Boolean graphql_enabled) {
		this.graphql_enabled = graphql_enabled;
	}

	public Boolean getBinary_storage_enabled() {
		return binary_storage_enabled;
	}

	public void setBinary_storage_enabled(Boolean binary_storage_enabled) {
		this.binary_storage_enabled = binary_storage_enabled;
	}

	public Integer getInline_resource_storage_below_size() {
		return inline_resource_storage_below_size;
	}

	public void setInline_resource_storage_below_size(Integer inline_resource_storage_below_size) {
		this.inline_resource_storage_below_size = inline_resource_storage_below_size;
	}

	public Boolean getBulk_export_enabled() {
		return bulk_export_enabled;
	}

	public void setBulk_export_enabled(Boolean bulk_export_enabled) {
		this.bulk_export_enabled = bulk_export_enabled;
	}

	public Boolean getBulk_import_enabled() {
		return bulk_import_enabled;
	}

	public void setBulk_import_enabled(Boolean bulk_import_enabled) {
		this.bulk_import_enabled = bulk_import_enabled;
	}

	public EncodingEnum getDefault_encoding() {
		return default_encoding;
	}

	public void setDefault_encoding(EncodingEnum default_encoding) {
		this.default_encoding = default_encoding;
	}

	public FhirVersionEnum getFhir_version() {
		return fhir_version;
	}

	public void setFhir_version(FhirVersionEnum fhir_version) {
		this.fhir_version = fhir_version;
	}

	public Integer getMax_binary_size() {
		return max_binary_size;
	}

	public void setMax_binary_size(Integer max_binary_size) {
		this.max_binary_size = max_binary_size;
	}

	public Integer getMax_page_size() {
		return max_page_size;
	}

	public void setMax_page_size(Integer max_page_size) {
		this.max_page_size = max_page_size;
	}

	public Long getRetain_cached_searches_mins() {
		return retain_cached_searches_mins;
	}

	public void setRetain_cached_searches_mins(Long retain_cached_searches_mins) {
		this.retain_cached_searches_mins = retain_cached_searches_mins;
	}

	public Long getReuse_cached_search_results_millis() {
		return reuse_cached_search_results_millis;
	}

	public void setReuse_cached_search_results_millis(Long reuse_cached_search_results_millis) {
		if (Objects.equals(reuse_cached_search_results_millis, 0L)) {
			this.reuse_cached_search_results_millis = null;
		} else {
			this.reuse_cached_search_results_millis = reuse_cached_search_results_millis;
		}
	}

	public Map<String, Tester> getTester() {
		return tester;
	}

	public void setTester(Map<String, Tester> tester) {
		this.tester = tester;
	}

	public Boolean getNarrative_enabled() {
		return narrative_enabled;
	}

	public void setNarrative_enabled(Boolean narrative_enabled) {
		this.narrative_enabled = narrative_enabled;
	}

	public Boolean getLastn_enabled() {
		return lastn_enabled;
	}

	public void setLastn_enabled(Boolean lastn_enabled) {
		this.lastn_enabled = lastn_enabled;
	}

	public boolean getStore_resource_in_lucene_index_enabled() {
		return store_resource_in_lucene_index_enabled;
	}

	public void setStore_resource_in_lucene_index_enabled(Boolean store_resource_in_lucene_index_enabled) {
		this.store_resource_in_lucene_index_enabled = store_resource_in_lucene_index_enabled;
	}

	public NormalizedQuantitySearchLevel getNormalized_quantity_search_level() {
		return this.normalized_quantity_search_level;
	}

	public void setNormalized_quantity_search_level(NormalizedQuantitySearchLevel normalized_quantity_search_level) {
		this.normalized_quantity_search_level = normalized_quantity_search_level;
	}

	public boolean getInstall_transitive_ig_dependencies() {
		return install_transitive_ig_dependencies;
	}

	public void setInstall_transitive_ig_dependencies(boolean install_transitive_ig_dependencies) {
		this.install_transitive_ig_dependencies = install_transitive_ig_dependencies;
	}

	public Boolean getValidate_resource_status_for_package_upload() {
		return validate_resource_status_for_package_upload;
	}

	public void setValidate_resource_status_for_package_upload(Boolean validate_resource_status_for_package_upload) {
		this.validate_resource_status_for_package_upload = validate_resource_status_for_package_upload;
	}

	public Integer getBundle_batch_pool_size() {
		return this.bundle_batch_pool_size;
	}

	public void setBundle_batch_pool_size(Integer bundle_batch_pool_size) {
		this.bundle_batch_pool_size = bundle_batch_pool_size;
	}

	public Integer getBundle_batch_pool_max_size() {
		return bundle_batch_pool_max_size;
	}

	public void setBundle_batch_pool_max_size(Integer bundle_batch_pool_max_size) {
		this.bundle_batch_pool_max_size = bundle_batch_pool_max_size;
	}

	public Set<String> getLocal_base_urls() {
		return local_base_urls;
	}

	public Set<String> getLogical_urls() {
		return logical_urls;
	}

	public Boolean getIg_runtime_upload_enabled() {
		return ig_runtime_upload_enabled;
	}

	public void setIg_runtime_upload_enabled(Boolean ig_runtime_upload_enabled) {
		this.ig_runtime_upload_enabled = ig_runtime_upload_enabled;
	}

	public String getCustom_content_path() {
		return custom_content_path;
	}

	public void setCustom_content_path(String custom_content_path) {
		this.custom_content_path = custom_content_path;
	}

	public String getApp_content_path() {
		return app_content_path;
	}

	public void setApp_content_path(String app_content_path) {
		this.app_content_path = app_content_path;
	}

	public Boolean getLanguage_search_parameter_enabled() {
		return language_search_parameter_enabled;
	}

	public void setLanguage_search_parameter_enabled(Boolean language_search_parameter_enabled) {
		this.language_search_parameter_enabled = language_search_parameter_enabled;
	}

	public List<Integer> getSearch_prefetch_thresholds() {
		return this.search_prefetch_thresholds;
	}

	public void setSearch_prefetch_thresholds(List<Integer> thePrefetchThresholds) {
		this.search_prefetch_thresholds = thePrefetchThresholds;
	}

	public boolean getUpliftedRefchains_enabled() {
		return upliftedRefchains_enabled;
	}

	public void setUpliftedRefchains_enabled(boolean upliftedRefchains_enabled) {
		this.upliftedRefchains_enabled = upliftedRefchains_enabled;
	}

	public Boolean getUserRequestRetryVersionConflictsInterceptorEnabled() {
		return userRequestRetryVersionConflictsInterceptorEnabled;
	}

	public void setUserRequestRetryVersionConflictsInterceptorEnabled(
			Boolean userRequestRetryVersionConflictsInterceptorEnabled) {
		this.userRequestRetryVersionConflictsInterceptorEnabled = userRequestRetryVersionConflictsInterceptorEnabled;
	}

	public boolean getEnable_index_of_type() {
		return enable_index_of_type;
	}

	public void setEnable_index_of_type(boolean enable_index_of_type) {
		this.enable_index_of_type = enable_index_of_type;
	}

	public Boolean getResource_dbhistory_enabled() {
		return resource_dbhistory_enabled;
	}

	public void setResource_dbhistory_enabled(Boolean resource_dbhistory_enabled) {
		this.resource_dbhistory_enabled = resource_dbhistory_enabled;
	}

	public Boolean getPre_expand_value_sets() {
		return this.pre_expand_value_sets;
	}

	public void setPre_expand_value_sets(Boolean pre_expand_value_sets) {
		this.pre_expand_value_sets = pre_expand_value_sets;
	}

	public Boolean getEnable_task_pre_expand_value_sets() {
		return this.enable_task_pre_expand_value_sets;
	}

	public void setEnable_task_pre_expand_value_sets(Boolean enable_task_pre_expand_value_sets) {
		this.enable_task_pre_expand_value_sets = enable_task_pre_expand_value_sets;
	}

	public Integer getPre_expand_value_sets_default_count() {
		return pre_expand_value_sets_default_count;
	}

	public void setPre_expand_value_sets_default_count(Integer pre_expand_value_sets_default_count) {
		this.pre_expand_value_sets_default_count = pre_expand_value_sets_default_count;
	}

	public Integer getPre_expand_value_sets_max_count() {
		return pre_expand_value_sets_max_count;
	}

	public void setPre_expand_value_sets_max_count(Integer pre_expand_value_sets_max_count) {
		this.pre_expand_value_sets_max_count = pre_expand_value_sets_max_count;
	}

	public Integer getMaximum_expansion_size() {
		return maximum_expansion_size;
	}

	public void setMaximum_expansion_size(Integer maximum_expansion_size) {
		this.maximum_expansion_size = maximum_expansion_size;
	}

	public Map<String, RemoteSystem> getRemoteTerminologyServicesMap() {
		return remote_terminology_service;
	}

	public void setRemote_terminology_service(Map<String, RemoteSystem> remote_terminology_service) {
		this.remote_terminology_service = remote_terminology_service;
	}

	public JpaStorageSettings.StoreMetaSourceInformationEnum getStore_meta_source_information() {
		return store_meta_source_information;
	}

	public void setStore_meta_source_information(
			JpaStorageSettings.StoreMetaSourceInformationEnum store_meta_source_information) {
		this.store_meta_source_information = store_meta_source_information;
	}

	public static class Cors {
		private Boolean allow_Credentials = true;
		private List<String> allowed_origin = List.of("*");

		public List<String> getAllowed_origin() {
			return allowed_origin;
		}

		public void setAllowed_origin(List<String> allowed_origin) {
			this.allowed_origin = allowed_origin;
		}

		public Boolean getAllow_Credentials() {
			return allow_Credentials;
		}

		public void setAllow_Credentials(Boolean allow_Credentials) {
			this.allow_Credentials = allow_Credentials;
		}
	}

	public static class Logger {

		private String name = "fhirtest.access";
		private String error_format = "ERROR - ${requestVerb} ${requestUrl}";
		private String format =
				"Path[${servletPath}] Source[${requestHeader.x-forwarded-for}] Operation[${operationType} ${operationName} ${idOrResourceName}] UA[${requestHeader.user-agent}] Params[${requestParameters}] ResponseEncoding[${responseEncodingNoDefault}] Operation[${operationType} ${operationName} ${idOrResourceName}] UA[${requestHeader.user-agent}] Params[${requestParameters}] ResponseEncoding[${responseEncodingNoDefault}]";
		private Boolean log_exceptions = true;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getError_format() {
			return error_format;
		}

		public void setError_format(String error_format) {
			this.error_format = error_format;
		}

		public String getFormat() {
			return format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public Boolean getLog_exceptions() {
			return log_exceptions;
		}

		public void setLog_exceptions(Boolean log_exceptions) {
			this.log_exceptions = log_exceptions;
		}
	}

	public static class Tester {

		private String name;
		private String server_address;
		private Boolean refuse_to_fetch_third_party_urls = true;
		private FhirVersionEnum fhir_version = FhirVersionEnum.R4;

		public FhirVersionEnum getFhir_version() {
			return fhir_version;
		}

		public void setFhir_version(FhirVersionEnum fhir_version) {
			this.fhir_version = fhir_version;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getServer_address() {
			return server_address;
		}

		public void setServer_address(String server_address) {
			this.server_address = server_address;
		}

		public Boolean getRefuse_to_fetch_third_party_urls() {
			return refuse_to_fetch_third_party_urls;
		}

		public void setRefuse_to_fetch_third_party_urls(Boolean refuse_to_fetch_third_party_urls) {
			this.refuse_to_fetch_third_party_urls = refuse_to_fetch_third_party_urls;
		}
	}

	public static class Validation {

		private Boolean requests_enabled = false;
		private Boolean responses_enabled = false;

		public Boolean getRequests_enabled() {
			return requests_enabled;
		}

		public void setRequests_enabled(Boolean requests_enabled) {
			this.requests_enabled = requests_enabled;
		}

		public Boolean getResponses_enabled() {
			return responses_enabled;
		}

		public void setResponses_enabled(Boolean responses_enabled) {
			this.responses_enabled = responses_enabled;
		}
	}

	public static class Partitioning {

		private Boolean partitioning_include_in_search_hashes = false;
		private Boolean allow_references_across_partitions = false;
		private Boolean conditional_create_duplicate_identifiers_enabled = false;
		private Boolean database_partition_mode_enabled = false;
		private Boolean patient_id_partitioning_mode = false;
		private Integer default_partition_id = 0;
		private boolean request_tenant_partitioning_mode = true;

		public boolean isRequest_tenant_partitioning_mode() {
			return request_tenant_partitioning_mode;
		}

		public Integer getDefault_partition_id() {
			return default_partition_id;
		}

		public void setDefault_partition_id(Integer theDefault_partition_id) {
			default_partition_id = theDefault_partition_id;
		}

		public Boolean getDatabase_partition_mode_enabled() {
			return database_partition_mode_enabled;
		}

		public void setDatabase_partition_mode_enabled(Boolean theDatabase_partition_mode_enabled) {
			database_partition_mode_enabled = theDatabase_partition_mode_enabled;
		}

		public Boolean getPatient_id_partitioning_mode() {
			return patient_id_partitioning_mode;
		}

		public void setPatient_id_partitioning_mode(Boolean thePatient_id_partitioning_mode) {
			patient_id_partitioning_mode = thePatient_id_partitioning_mode;
		}

		public Boolean getPartitioning_include_in_search_hashes() {
			return partitioning_include_in_search_hashes;
		}

		public void setPartitioning_include_in_search_hashes(Boolean partitioning_include_in_search_hashes) {
			this.partitioning_include_in_search_hashes = partitioning_include_in_search_hashes;
		}

		public Boolean getAllow_references_across_partitions() {
			return allow_references_across_partitions;
		}

		public void setAllow_references_across_partitions(Boolean allow_references_across_partitions) {
			this.allow_references_across_partitions = allow_references_across_partitions;
		}

		public Boolean getConditional_create_duplicate_identifiers_enabled() {
			return conditional_create_duplicate_identifiers_enabled;
		}

		public void setConditional_create_duplicate_identifiers_enabled(
				Boolean conditional_create_duplicate_identifiers_enabled) {
			this.conditional_create_duplicate_identifiers_enabled = conditional_create_duplicate_identifiers_enabled;
		}

		public boolean getRequest_tenant_partitioning_mode() {
			return request_tenant_partitioning_mode;
		}

		public void setRequest_tenant_partitioning_mode(boolean theRequest_tenant_partitioning_mode) {
			request_tenant_partitioning_mode = theRequest_tenant_partitioning_mode;
		}
	}

	public static class RemoteSystem {
		private String system;
		private String url;

		public String getSystem() {
			return system;
		}

		public void setSystem(String system) {
			this.system = system;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	public static class Subscription {

		private Boolean resthook_enabled = false;
		private Boolean websocket_enabled = false;
		private Email email = null;
		private Integer polling_interval_ms = null;
		private Boolean immediately_queued = false;

		public Boolean getResthook_enabled() {
			return resthook_enabled;
		}

		public void setResthook_enabled(Boolean resthook_enabled) {
			this.resthook_enabled = resthook_enabled;
		}

		public Boolean getWebsocket_enabled() {
			return websocket_enabled;
		}

		public void setWebsocket_enabled(Boolean websocket_enabled) {
			this.websocket_enabled = websocket_enabled;
		}

		public Email getEmail() {
			return email;
		}

		public void setEmail(Email email) {
			this.email = email;
		}

		public Integer getPolling_interval_ms() {
			return polling_interval_ms;
		}

		public void setPolling_interval_ms(Integer polling_interval_ms) {
			this.polling_interval_ms = polling_interval_ms;
		}

		public Boolean getImmediately_queued() {
			return immediately_queued;
		}

		public void setImmediately_queued(Boolean immediately_queued) {
			this.immediately_queued = immediately_queued;
		}

		public static class Email {
			private String from;
			private String host;
			private Integer port = 25;
			private String username;
			private String password;
			private Boolean auth = false;
			private Boolean startTlsEnable = false;
			private Boolean startTlsRequired = false;
			private Boolean quitWait = false;

			public String getFrom() {
				return from;
			}

			public void setFrom(String from) {
				this.from = from;
			}

			public String getHost() {
				return host;
			}

			public void setHost(String host) {
				this.host = host;
			}

			public Integer getPort() {
				return port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public Boolean getAuth() {
				return auth;
			}

			public void setAuth(Boolean auth) {
				this.auth = auth;
			}

			public Boolean getStartTlsEnable() {
				return startTlsEnable;
			}

			public void setStartTlsEnable(Boolean startTlsEnable) {
				this.startTlsEnable = startTlsEnable;
			}

			public Boolean getStartTlsRequired() {
				return startTlsRequired;
			}

			public void setStartTlsRequired(Boolean startTlsRequired) {
				this.startTlsRequired = startTlsRequired;
			}

			public Boolean getQuitWait() {
				return quitWait;
			}

			public void setQuitWait(Boolean quitWait) {
				this.quitWait = quitWait;
			}
		}
	}
}
