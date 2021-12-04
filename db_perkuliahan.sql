-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2021 at 10:04 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perkuliahan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tambahmahasiswa`
--

CREATE TABLE `tambahmahasiswa` (
  `npm` int(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jurusan` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `alamat` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tambahmahasiswa`
--

INSERT INTO `tambahmahasiswa` (`npm`, `nama`, `jurusan`, `jenis_kelamin`, `alamat`) VALUES
(1212, 'raihan', 'SISTEM INFORMASI', 'laki laki', 'ja.pelita'),
(9889, 'okik', 'KOM.AKUNTANSI', 'laki laki', 'jl.sumedang'),
(12345, 'yogi', 'AKUNTANSI', 'laki laki', 'jl.nusa'),
(34893, 'kdfndj', 'AKUNTANSI', 'laki laki', 'lkjh'),
(899888, 'jumiati', 'SISTEM INFORMASI', 'perempuan', 'kademangan'),
(1212145, 'saiful', 'KOM.AKUNTANSI', 'laki laki', 'jl.raya gede');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tambahmahasiswa`
--
ALTER TABLE `tambahmahasiswa`
  ADD PRIMARY KEY (`npm`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tambahmahasiswa`
--
ALTER TABLE `tambahmahasiswa`
  MODIFY `npm` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1212150;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
