
# react-native-store-rating

## Getting started

`$ npm install react-native-store-rating --save`

### Mostly automatic installation

`$ react-native link react-native-store-rating`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-store-rating` and add `RNStoreRating.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNStoreRating.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNStoreRatingPackage;` to the imports at the top of the file
  - Add `new RNStoreRatingPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-store-rating'
  	project(':react-native-store-rating').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-store-rating/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-store-rating')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNStoreRating.sln` in `node_modules/react-native-store-rating/windows/RNStoreRating.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Store.Rating.RNStoreRating;` to the usings at the top of the file
  - Add `new RNStoreRatingPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNStoreRating from 'react-native-store-rating';

// TODO: What to do with the module?
RNStoreRating;
```
  