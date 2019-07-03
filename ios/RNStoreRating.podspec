require "json"
version = JSON.parse(File.read("../package.json"))["version"]

Pod::Spec.new do |s|
  s.name           = "RNStoreRating"
  s.version        = version
  s.summary        = "App Store and Play Store Ratings for React Native."
  s.homepage       = "https://github.com/duongntb94/react-native-store-rating"
  s.license        = "MIT"
  s.author         = { "Duong Nguyen" => "duongntb94@gmail.com" }
  s.platform       = :ios, "7.0"
  s.source         = { :git => "https://github.com/duongntb94/react-native-store-rating.git", :tag => "v#{s.version}" }
  s.source_files   = "*.{h,m}"
  s.preserve_paths = "**/*.js"
  s.requires_arc = true

  s.dependency "React"

end