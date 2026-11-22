import { View, Text, TextInput, Pressable, Image, StatusBar, StyleSheet } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';

function MyButton() {
  return (
    <Pressable style={styles.button}>
      <Text style={styles.buttonText}>BUTTON</Text>
    </Pressable>
  );
}

function ButtonRow() {
  return (
    <View style={styles.buttonRow}>
      <MyButton />
      <MyButton />
    </View>
  );
}

export default function App() {
  return (
    <View style={styles.container}>
      <StatusBar barStyle="light-content" />

      <SafeAreaView edges={['top']} style={styles.statusBarArea}>
        <Text style={styles.title}>Example 1: React Native</Text>
      </SafeAreaView>

      <Image source={require('./assets/img.png')} style={styles.image} />

      <ButtonRow />
      <View style={{ height: 30 }} />
      <ButtonRow />

      <View style={styles.emailRow}>
        <Text style={styles.emailLabel}>Email</Text>
        <TextInput style={styles.input} keyboardType="email-address" autoCapitalize="none" />
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container:     { flex: 1, backgroundColor: '#FAFAFA' },
  statusBarArea: { backgroundColor: '#1E5E54' },
  title:         { backgroundColor: '#2D8577', color: 'white', fontSize: 18, fontWeight: '600', padding: 16 },
  image:         { width: 175, height: 175, alignSelf: 'center', marginVertical: 25 },
  buttonRow:     { flexDirection: 'row', justifyContent: 'space-around' },
  button:        { backgroundColor: '#D6D7D7', paddingVertical: 10, paddingHorizontal: 16, elevation: 2 },
  buttonText:    { color: 'black', fontWeight: '500' },
  emailRow:      { flexDirection: 'row', alignItems: 'center', marginTop: 35, paddingHorizontal: 15 },
  emailLabel:    { flex: 0.3, color: '#848484' },
  input:         { flex: 0.7, borderBottomWidth: 2, borderBottomColor: '#CD1B60', marginRight: 70, paddingVertical: 4 },
});